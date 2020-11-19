package exam;

import java.util.ArrayList;
import java.util.Scanner;

class Book {

	String title, author;
	double price;
	public Book(String title, String author, double price)
	{
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void dispInfo()
	{
		System.out.printf("%s,%s,%.2f\n", title ,author , price);
	}
	
	
}

public class Q3 {

    public static void compute(ArrayList<Book> books) {
    	double sum = 0;
    	Book max = books.get(0), min = books.get(0);
    	for (Book book : books)
		{
			sum += book.price;
			if( max.price < book.price)
				max = book;
			if( min.price > book.price)
				min = book;
		}
    	
    	System.out.printf("%.2f\n%.2f\n", sum, sum / books.size() );    	
    	max.dispInfo();
    	min.dispInfo();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<n; i++) {
            String title = scan.next();
            String author = scan.next();
            double price = scan.nextDouble();
            scan.nextLine();
            books.add(new Book(title, author, price));
        }

        compute(books);
    }

}