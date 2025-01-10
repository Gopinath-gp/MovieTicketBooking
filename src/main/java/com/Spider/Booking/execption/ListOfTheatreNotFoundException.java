package com.Spider.Booking.execption;

public class ListOfTheatreNotFoundException  extends RuntimeException{
	private String message;

	public ListOfTheatreNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
