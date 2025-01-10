package com.Spider.Booking.execption;
public class ListofSeatsNotFoundExecption  extends RuntimeException{
	private String message;

	public ListofSeatsNotFoundExecption(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
