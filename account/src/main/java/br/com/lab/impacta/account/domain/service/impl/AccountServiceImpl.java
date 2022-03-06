package br.com.lab.impacta.account.domain.service.impl;

import org.springframework.stereotype.Service;

import br.com.lab.impacta.account.domain.exception.AccountNotFoundException;
import br.com.lab.impacta.account.domain.exception.AccountWithoutBalanceException;
import br.com.lab.impacta.account.domain.model.Account;
import br.com.lab.impacta.account.domain.service.AccountService;
import br.com.lab.impacta.account.infrastructure.message.MessageService;
import br.com.lab.impacta.account.infrastructure.repository.AccountRepository;
import lombok.AllArgsConstructor;

//Essa implementação está para Domain Layer Service na arquiteura hexagonal
@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
	
	private MessageService messageService;
	
	private AccountRepository accountRepository;


	@Override
	public Account find(Long accountId) {
		return this.accountRepository.findById(accountId)
				.orElseThrow(() -> new AccountNotFoundException(
						this.messageService.getMessage("lab.account.exceptions.account-dont-exists-message"),
						this.messageService.getMessage("lab.account.exceptions.account-dont-exists-description")));
	}

	@Override
	public void debit(Long accountId, Double valueOfDebit) {
		Account account = this.find(accountId);
	
		boolean debited = account.debit(valueOfDebit);

		if (!debited)
			throw new AccountWithoutBalanceException(
					this.messageService.getMessage("lab.account.exceptions.account-without-balance-message"),
					this.messageService.getMessage("lab.account.exceptions.account-without-balance-description"));

		this.accountRepository.save(account);
	}
}
