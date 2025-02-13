package com.ust.lms;

public class MainUtil {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book b1 = new Book("A-Z","Java","James",100,4,"prog");
		Book b2 = new Book("abp","English","Kyle",21,"Comm");
		
		Library l = new Library();
		
		l.setLname("Techademy");
		l.setAddress("Bangalore");
		l.addBook(b1);
		l.addBook(b2);
		
		SerializationHandler sh = new SerializationHandler();
		
		sh.serializeLibrary(l, "library.txt");
		Library d1 = sh.deserializeLibrary("library.txt");
		
		System.out.println(d1.displayAvailableBook());
		
		//System.out.println("ISBN\t"+ "Title\t"+ "Author\t" + "Price\t" + "");
		
		for(int i = 0; i < l.displayAvailableBook().size();i++) {
			Book d2 = l.displayAvailableBook().get(i);
			System.out.println(d2.getISBN() +"\t" + d2.getAuthor() +"\t" + d2.getTitle() + "\t" + d2.getGenre());
		}
		
		//search by author
		
		String author = "James";
		List<Book> se = l.searchByAuthor(author);
		
		if(se.size() <= 0) {
			throw new BookNotFoundException("The Book is Not Available\n");
		}
		
		else {
			System.out.println(se);
		}
		
		//Search by genre
		
		String genre = "it";
		List<book> l2 = l.searchByGenre(genre);
		
		if(l2.size() <= 0) {
			throw new BookNotFoundException("The Book is Not Available");
		} 
		else {
			System.out.println(l2);
		}
		
		//remove book by ISBN
		
		String ISBN = "hhh";
		l.removeBook(ISBN);
		
		// Borrow Book
		
		Member mb = new Member();
		mb.setID(11);
		mb.setName("Hero");
		mb.setQty(7);
		
		String bISBN = "abp";
		
		for(int i = 0; i <= l.displayAvailableBook().size(); i++) {
			Book b = l.displayAvailableBook().get(i);
			
			if(mb.getQty() < b.getAvailability()) {
				mb.borrowBook(bISBN);
			}
			else {
				throw new NotEnoughBooksEXCEPTION("Not Enough Books!");
			}
		}
		
		//Display Borrowed Books
		System.out.println(mb.displayBorrowedBooks());
		
		//Return books
		
		System.out.println(mb.returnBook(bISBN));
	}

}
