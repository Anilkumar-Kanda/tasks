package java_oops_tasks;
// Task-1
class Book{
	String title;
	String author;
	String price;
	void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: "+ author);
		System.out.println("Price: " + price);
	}
}

public class BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.title = "Biopic";
		book1.author = "Stephen";
		book1.price = "400.00";
		
		Book book2 = new Book();
		book2.title = "Day Dreams";
		book2.author = "Peter";
		book2.price = "550.00";
		
		System.out.println("Book 1 details:");
		book1.displayDetails();
		
		System.out.println("Book 2 details");
		book2.displayDetails();

	}

}
