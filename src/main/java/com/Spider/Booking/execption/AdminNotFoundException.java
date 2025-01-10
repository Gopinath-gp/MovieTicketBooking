package com.Spider.Booking.execption;
public class AdminNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public AdminNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
}