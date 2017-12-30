	package com.ramizm.aspectAnnotationProgrammin;
	
	
	
	
	public class StroeDO {
	
		public String storeId;
		public String storeName;
		public String getStoreId() {
			System.out.println("StroeDO.getStoreId()");
			return storeId;
		}
		public void setStoreId(String storeId) {
			System.out.println("StroeDO.setStoreId()="+storeId);
			this.storeId = storeId;
		}
		public String getStoreName() {
			System.out.println("StroeDO.getStoreName() dd=");
			return storeName;
			
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
	System.out.println("StroeDO.setStoreName()="+this.storeName);
		}
		
	}
