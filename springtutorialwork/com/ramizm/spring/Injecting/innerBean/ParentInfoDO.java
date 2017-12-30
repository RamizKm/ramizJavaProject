package com.ramizm.spring.Injecting.innerBean;

public class ParentInfoDO {

	
	private ChildrenInfoDO childContent;

	public ChildrenInfoDO getChildContent() {
		System.out.println("ParentInfoDO.getChildContent()="+this.childContent);
		return childContent;
	}

	public void setChildContent(ChildrenInfoDO childContent) {
		System.out.println("ParentInfoDO.setChildContent()="+childContent);
		this.childContent = childContent;
	}
	
	protected void getAllChildInfoparent()
	{
		System.out.println("ParentInfoDO.getAllChildInfo()");
		childContent.getAllChildInfoStudent();
	}
	
}
