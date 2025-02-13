package com.ust.lms;

public class BookNotFoundException extends Exception{
	
	public static final long serialVersionUID = 1L;

	public BookNotFoundException(String msg) {
		super(msg);
	}
}
