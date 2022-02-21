package br.com.lab.impacta.account.domain.exception;

public class AccountNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 8674183607968656108L;

	private String description;

    public String getDescription(){
        return description;
    }

    public AccountNotFoundException() { super(); }

    public AccountNotFoundException(String message, String description) {
        super(message);

        this.description = description;
    }
}