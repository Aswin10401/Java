package com.ust.lms;

import java.io.Serializable;

public class Book implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
	private String ISBN;
	
	private String title;
	
	private String author;
	
	private String genre;
	
	private int price;
	
	private int availability;
	
	public Book() {}
	
	public Book(String iSBN, String title, String author, String genre, int price, int availability) {
		
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
		this.availability = availability;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", genre=" + genre + ", price="
				+ price + ", availability=" + availability + "]";
	}
	
	
	
	
	
	

}
