package com.algaworks.algafood.infrastructure.service.email;

public class EmailExecption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmailExecption(String message, Throwable cause) {
		super(message, cause);
	}

	public EmailExecption(String message) {
		super(message);
	}
	
}
