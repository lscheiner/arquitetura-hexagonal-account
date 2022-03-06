package br.com.lab.impacta.account.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lab.impacta.account.application.AccountApplication;
import br.com.lab.impacta.account.application.dto.response.AccountBalanceResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/accounts")
@AllArgsConstructor
public class BalanceController {

	private AccountApplication accountApplication;

	@GetMapping("/{accountId}/balance")
	public ResponseEntity<AccountBalanceResponse> balance(@PathVariable long accountId) {

		AccountBalanceResponse accountBalanceResponse = this.accountApplication.getBalance(accountId);

		return ResponseEntity.ok(accountBalanceResponse);
	}
}
