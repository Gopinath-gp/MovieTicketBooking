package com.Spider.Booking.execption;
public class SeatNotFoundException extends RuntimeException {
	private String message;

	public SeatNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
