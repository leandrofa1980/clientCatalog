package br.com.leandrofa1980.clientcatalog.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}
}
