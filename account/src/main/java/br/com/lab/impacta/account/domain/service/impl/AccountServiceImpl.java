package br.com.lab.impacta.account.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.lab.impacta.account.domain.exception.AccountNotFoundException;
import br.com.lab.impacta.account.domain.exception.AccountWithoutBalanceException;
import br.com.lab.impacta.account.domain.model.Account;
import br.com.lab.impacta.account.domain.service.AccountService;
import br.com.lab.impacta.account.infrastructure.repository.AccountRepository;

//Essa implementação está para Domain Layer Service na arquiteura hexagonal
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Value("${lab.account.exceptions.account-dont-exists-message}")
	private String messageExceptionAccountNotFound;

	@Value("${lab.account.exceptions.account-dont-exists-description}")
	private String descriptionExceptionAccountNotFound;

	@Value("${lab.account.exceptions.account-without-balance-message}")
	private String messageExceptionAccountWithoutBalance;

	@Value("${lab.account.exceptions.account-without-balance-description}")
	private String descriptionExceptionAccountWithoutBalance;

	@Override
	public Account find(Long accountId) {
		return this.accountRepository.findById(accountId)
				.orElseThrow(() -> new AccountNotFoundException(messageExceptionAccountNotFound,
						descriptionExceptionAccountNotFound));
	}

	@Override
	public void debit(Long accountId, Double valueOfDebit) {
		Account account = this.find(accountId);

		boolean debited = account.debit(valueOfDebit);

		if (!debited)
			throw new AccountWithoutBalanceException(messageExceptionAccountWithoutBalance,
					descriptionExceptionAccountWithoutBalance);

		this.accountRepository.save(account);
	}
}
