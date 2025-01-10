package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class ListOfScreenNotFoundException extends RuntimeException {
	private String message;

}
