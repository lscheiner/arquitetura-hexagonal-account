package br.com.lab.impacta.account.domain.exception;

import lombok.Getter;

@Getter
public class AccountWithoutBalanceException extends RuntimeException {

	private static final long serialVersionUID = -7351146825129595990L;

	private final String description;

	public AccountWithoutBalanceException(String message, String description) {
		super(message);
		this.description = description;
	}
}
