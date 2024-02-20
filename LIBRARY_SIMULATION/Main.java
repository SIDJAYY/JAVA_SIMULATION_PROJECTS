package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book libro1 = new Book("CJ","SUPER JAVA","3164651");
		Book libro2 = new Book("CARDO","GOLDEN OIL","65498");
		Book libro3 = new Book("CJ POGI","KAWASAKI","6549852");
		
		Book.addBook(libro1);
		Book.addBook(libro2);
		Book.addBook(libro3);
		libro3.setIsbn(scan.nextLine());
		ArrayList <Book> bookCollection = Book.getBookCollection();
		for(Book book : bookCollection) {
			System.out.println(book.getTitle()+" by "+ book.getAuthor()+" ISBN:"+book.getIsbn() );
		}
	
		System.out.print("");
		
		
		
		
	}

}
