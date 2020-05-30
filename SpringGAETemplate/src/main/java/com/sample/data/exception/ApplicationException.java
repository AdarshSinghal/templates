package com.sample.data.exception;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = -6518309985813530758L;

	public ApplicationException() {
	}

	public ApplicationException(String message) {
		super(message);
	}

}
