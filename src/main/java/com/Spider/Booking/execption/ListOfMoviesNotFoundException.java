package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class ListOfMoviesNotFoundException  extends RuntimeException{
 private String message;
 
}
