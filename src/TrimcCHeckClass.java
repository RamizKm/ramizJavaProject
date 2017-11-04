
public class TrimcCHeckClass {
	
	
	public static void main(String[] args) {
		
		String textvl="  pune            ";
		//in above case there are spaces before and after
		//so length before trim is 18
		System.out.println(textvl.length());
		
		
		//after trimming u need to assign value
		String newVal=textvl.trim();
		System.out.println("newval="+newVal);
		System.out.println(newVal.length());
		//after trimming lenght is 4
		//do not trim on null values it will give null pointer exception
		//before doing anytrim check , always check for null like bleow
		
		if(null==textvl|| textvl.trim().length()==0) {
			System.out.println("it is empty string");
		}
		
	}

}
