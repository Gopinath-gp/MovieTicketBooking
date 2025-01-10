package com.Spider.Booking.execption;

public class ListOfLocationNotFoundException  extends RuntimeException{
	private String message;
	public ListOfLocationNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
