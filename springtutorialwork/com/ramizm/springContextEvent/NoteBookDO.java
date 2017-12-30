package com.ramizm.springContextEvent;

public class NoteBookDO {
	
	public String notebookId;
	public String notebookName;
	public String getNotebookId() {
		System.out.println("NoteBookDO.getNotebookId()");
		return notebookId;
	}
	public void setNotebookId(String notebookId) {
	System.out.println("NoteBookDO.setNotebookId()");
		this.notebookId = notebookId;
	}
	public String getNotebookName() {
	System.out.println("NoteBookDO.getNotebookName()");
		return notebookName;
	}
	public void setNotebookName(String notebookName) {
		this.notebookName = notebookName;
	}		

}
