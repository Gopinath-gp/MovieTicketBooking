package com.Spider.Booking.execption;

import lombok.Data;


public class TicketNotFoundExecption  extends RuntimeException{
private String message;

public TicketNotFoundExecption(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

}
