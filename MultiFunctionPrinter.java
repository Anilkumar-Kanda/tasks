package java_tasks_exceptions;
// Task 2.3

interface Printable{
	void print(String document);
}

interface Scannable{
	void scan(String document);
}

public class MultiFunctionPrinter implements Printable,Scannable {
	public void print(String document) {
		System.out.println("Printing Document: " + document);
	}
	public void scan(String document) {
		System.out.println("Scanning Document: " + document);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiFunctionPrinter mfp = new MultiFunctionPrinter();
		mfp.print("Report.pdf");
		mfp.scan("Invoice.pdf");

	}

}
