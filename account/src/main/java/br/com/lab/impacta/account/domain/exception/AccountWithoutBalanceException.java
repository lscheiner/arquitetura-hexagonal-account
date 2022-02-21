package br.com.lab.impacta.account.domain.exception;

public class AccountWithoutBalanceException extends RuntimeException {

	private static final long serialVersionUID = -7351146825129595990L;

	private String description;

    public String getDescription(){
        return description;
    }

    public AccountWithoutBalanceException() { super(); }

    public AccountWithoutBalanceException(String message, String description) {
        super(message);

        this.description = description;
    }
}
