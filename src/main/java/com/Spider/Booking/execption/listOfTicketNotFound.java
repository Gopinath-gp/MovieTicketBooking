package com.Spider.Booking.execption;


public class listOfTicketNotFound extends RuntimeException {
	private String message;

	public String getMessage() {
		return message;
	}

	public listOfTicketNotFound(String message) {
		super();
		this.message = message;
	}
	

}
