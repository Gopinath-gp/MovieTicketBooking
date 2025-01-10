package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class ScreenNotFoundException  extends RuntimeException{
	private String message;

}
