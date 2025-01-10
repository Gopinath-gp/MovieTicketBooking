package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class ShowNotFoundException  extends RuntimeException{
	private String message;

}
