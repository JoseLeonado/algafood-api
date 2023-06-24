package com.algaworks.algafood.infrastructure.service.storage;

public class StorageExecption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StorageExecption(String message, Throwable cause) {
		super(message, cause);
	}

	public StorageExecption(String message) {
		super(message);
	}
	
}
