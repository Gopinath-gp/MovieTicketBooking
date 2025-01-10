package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class UserNotFoundException extends RuntimeException {
	
	private String message;

}
