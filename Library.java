package com.ust.lms;

import java.util.List;

import java.util.ArrayList;

import java.io.Serializable;

public class Library implements Serializable {
	
	private List<Book> books;
	private String lname;
	private String address;
	
	public static final long serialVersionUID = 1L;
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addBook(Book book) {
		if(books == null) {
			books = new ArrayList<Book>();
		}
		books.add(book);
	}
	
	public void removeBook(String ISBN) {
		for(Book bk : books) {
			if(bk.getISBN().equals(ISBN)) {
				books.remove(bk);
				System.out.println("Book Deleted");
				break;
			}
		}
	}
	
	public List<Book> searchByAuthor(String author) {
		List<Book> bo = new ArrayList<>();
		for(int i = 0; i < book.size(); i++) {
			Book b = books.get(i);
			if(b.getAuthor().equals(author)) {
				bo.add(b);
			}
		}
		return bo;
	}
	
	public List<Book> searchByGenre(String genre) {
		List<Book> bo = new ArrayList<>();
		for(int i = 0; i < book.size(); i++) {
			Book b = books.get(i);
			if(b.getGenre().equals(genre)) {
				bo.add(b);
			}
		}
		return bo;
		
	}
	
	public List<Book> displayAvailableBook() {
		return books;
	}
	
	
	

}
