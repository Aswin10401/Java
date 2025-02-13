package com.ust.lms;

public class NotEnoughBooksException extends Exception{
	
	public static final long serialVersionUID = 1L;

	public NotEnoughBooksException(String msg) {
		super(msg);
	}
}
