package br.com.lab.impacta.account.domain.exception;

import lombok.Getter;

@Getter
public class AccountNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8674183607968656108L;

	private final String description;

	public AccountNotFoundException(String message, String description) {
		super(message);
		this.description = description;
	}
}
