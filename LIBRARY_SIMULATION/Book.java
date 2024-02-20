package hackerrank;

import java.util.ArrayList;

public class Book{
	private String  author;
	private String  title;
	private String  isbn;
	private static ArrayList < Book > bookCollection = new ArrayList < Book > ();
	
	// set the author name in parameters (main methods (instance))
	public Book(String author, String title, String isbn) {
		this.author = author; //(this) keyword will be pass in global variable or fields
		this.title = title;
		this.isbn = isbn;
	}
	//if you want to display the author you can use the get author method
	//same as the other methods that contains in the name get.
	public String getAuthor() {
		return author;
	}
	//if you want to set the author in different name.
	//same as the other names
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String  title) {
		this.title = title;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String  isbn) {
		this.isbn = isbn;
	}
	
	public static void addBook(Book book) {
		bookCollection.add(book);
	}
	
	public static void removeBook(Book book) {
		bookCollection.remove(book);
	}
	
	public static ArrayList <Book>getBookCollection(){
		return bookCollection;
	}
		
}