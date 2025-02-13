package com.ust.lms;

import java.util.ArrayList;

import java.util.List;

public class Member extends Library{

	public static final long serialVersionUID = 1L;
	
	private int ID;
	private String name;
	private List<Book> borrowedBooks;
	private int qty;
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	Library l = new Library();
	
	public Member() {
		Book b1 = new Book("A-Z" , "Java" , "James" , 100, 4 , "Prog");
		Book b2 = new Book("A-Z", "Python", "John", 32 , 5 , "IT");
		
		l.addBook(b1);
		l.addBook(b2);
	}
	
	public Member(int iD, String name , int qty) {
		ID = iD;
		this.name = name;
		this.qty = qty;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void borrowBook(String ISBN) {
		borrowedBooks = new ArrayList<>();
		
		for(Books b: l.displayAvailableBook()) {
			if(ISBN.equals(b.getISBN)) {
				borrowedBooks.add(b);
			}
		}
	}
	
	public void returnBook(String ISBN) {
		List<Book> lb = displayBorrowedBooks();
		
		for(Book b : lb) {
			if(b.getISBN().equals(ISBN)) {
				lb.remove(b);
				System.out.println("Successfully retuned book" +ISBN);
				break;
			}
		}
	}
	
	public List<Book> displayBorrowedBooks() {
		return borrowedBooks;
	}
	
}
