
public class LibBook
{
	String isbn;
	double price;
	String name;	
	boolean isBorrowed;
	
	public boolean borrow()
	{
		if(isBorrowed)
			return false;
		isBorrowed = true;
		return true;
	}
	
	public String getInfo()
	{
		return "isbn: " + isbn + "; name:  " + name +"; price: " + price + " isBorrowed: " + isBorrowed; 
	}

}	
