package com.Spider.Booking.execption;

import lombok.Data;

@Data
public class LocationNotFoundException extends RuntimeException {
private String message;
}
