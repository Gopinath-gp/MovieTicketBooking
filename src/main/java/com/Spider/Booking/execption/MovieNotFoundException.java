package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class MovieNotFoundException extends RuntimeException{
	private String message;

}
