package com.ramizm.springBeanPostProcessor;

public class BooKdo {

	String bookId;

	public String getBookId() {
		System.out.println("BooKdo.getBookId()="+bookId);
		return bookId;
	}

	public void setBookId(String bookId) {
		System.out.println("BooKdo.setBookId()"+bookId);
		this.bookId = bookId;
	}
	public BooKdo()
	{
		System.out.println("BooKdo.BooKdo()");
		System.out.println("BooKdo.BooKdo()");
	}
	
}
