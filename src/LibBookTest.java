
public class LibBookTest
{

	public static void main(String[] args)
	{
		LibBook javaBook = new LibBook();
		javaBook.isbn = "1234-4312413";
		javaBook.name = "这是一本好漂亮的JAVA书";
		javaBook.price = 100;
		javaBook.isBorrowed = false;
		System.out.println(javaBook.getInfo());
		javaBook.borrow();
		System.out.println(javaBook.getInfo());
		
		LibBook pythonBook = new LibBook();
		pythonBook.isbn = "132434-1234";
		pythonBook.name = "更漂亮的Python书";
		pythonBook.price = 12.5;
		System.out.println(pythonBook.getInfo());

	}

}
