package br.com.lab.impacta.account.application.impl;

import org.springframework.stereotype.Component;

import br.com.lab.impacta.account.application.AccountApplication;
import br.com.lab.impacta.account.application.adapter.AccountAdapter;
import br.com.lab.impacta.account.application.dto.request.DebitAccountRequest;
import br.com.lab.impacta.account.application.dto.response.AccountBalanceResponse;
import br.com.lab.impacta.account.application.dto.response.DebitAccountResponse;
import br.com.lab.impacta.account.domain.model.Account;
import br.com.lab.impacta.account.domain.service.AccountService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AccountApplicationImpl implements AccountApplication {

	private AccountService accountService;

	@Override
	public AccountBalanceResponse getBalance(Long accountId) {
		Account account = this.accountService.find(accountId);
		return AccountAdapter.toDtoBalance(account);
	}

	@Override
	public DebitAccountResponse debit(Long accountId, DebitAccountRequest debitAccountRequest) {
		this.accountService.debit(accountId, debitAccountRequest.getValueOfDebit());
		return new DebitAccountResponse(true);
	}
}
