package com.ramizm.springCustomEvent;

public class NewsPaperDO {
	
	
	private String newsPaperId;
	private String newsPaperName;
	public String getNewsPaperId() {
		System.out.println("NewsPaperDO.getNewsPaperId()="+newsPaperId);
		return newsPaperId;
	}
	public void setNewsPaperId(String newsPaperId) {
		System.out.println("NewsPaperDO.setNewsPaperId()");
		this.newsPaperId = newsPaperId;
	}
	public String getNewsPaperName() {
		System.out.println("NewsPaperDO.getNewsPaperName()");
		return newsPaperName;
	}
	public void setNewsPaperName(String newsPaperName) {
		this.newsPaperName = newsPaperName;
		System.out.println("NewsPaperDO.setNewsPaperName()-"+newsPaperName);
	}

}
