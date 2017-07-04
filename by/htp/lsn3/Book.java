package by.htp.lsn3;

public class Book {
	
	private int pageCount;
	private int publishYear;
	private String title;
	private String author;
	
	public Book ( int pageCount, int publishYear, String title, String author ) {
		System.out.println("Book constructor");
		this.pageCount = pageCount;
		this.publishYear = publishYear;
		this.title = title;
		this.author = author;
	}
	
	public void setPageCount(int count){
		pageCount = count;
	}
	
	public int getPageCount(){
		return pageCount;
	}
	
	

}
