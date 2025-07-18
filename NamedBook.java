/**★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 ★ Filename    : NamedBook.java
 ★ Author      : Alwin Jose George
 ★ Date        : 2025-07-18
 ★ Description : A simple program that defines a NamedBook class with 
 ★               instance variables for title, author, and price.
 ★               It uses a no-argument constructor and a displayDetails 
 ★               method to show the book details.
 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★**/
class Book{
	String title;
	String author;
	double price;
	Book(){
		title="Unknow";
		author="Not Assigned";
		price = 0.0;
		
	}
	public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price:" + price);
    }
}

public class NamedBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.displayDetails();
    }
}