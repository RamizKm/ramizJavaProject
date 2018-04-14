
import java.util.HashSet;


public class AbcDo {
	
	
	public static void main(String[] args) {
		
		AbcDo d=new AbcDo();
		d.setlName("lnamekcomding");
		
		System.out.println(d);
		
		 AbcDo dd=null;
		 System.out.println(dd);
		 
		
		
	}
	
	
	private String name;
	private String lName;
	@Override
	public String toString() {
		return "AbcDo [name=" + name + ", lName=" + lName + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	
	
	

}
