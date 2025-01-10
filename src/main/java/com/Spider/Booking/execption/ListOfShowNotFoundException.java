package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class ListOfShowNotFoundException extends RuntimeException{
	private String message;

}
