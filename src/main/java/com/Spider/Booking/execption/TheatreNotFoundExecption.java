package com.Spider.Booking.execption;


public class TheatreNotFoundExecption extends RuntimeException {
	private String message;

	public TheatreNotFoundExecption(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
