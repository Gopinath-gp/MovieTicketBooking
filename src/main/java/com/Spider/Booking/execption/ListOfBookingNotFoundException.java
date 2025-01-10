package com.Spider.Booking.execption;

public class ListOfBookingNotFoundException  extends RuntimeException{
	private String message;
	public ListOfBookingNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
