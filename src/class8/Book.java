package class8;

public class Book
{
	private int pageNum;
	private String title;


	
	
	public Book(int pageNum, String title)
	{
	
		this.pageNum = pageNum;
		this.title = title;
	}

	void setTitle(String m_title)
	{
		title = m_title;
	}

	void setPageNum(int m_pageNum)
	{
		if (m_pageNum < 200)
			m_pageNum = 200;
		pageNum = m_pageNum;
	}

	String getTitle()
	{
		return title;
	}

	int getPageNum()
	{
		return pageNum;
	}

	void showInfo()
	{
		System.out.println("Title: " + title + "; pageNum: " + pageNum);
	}
}
