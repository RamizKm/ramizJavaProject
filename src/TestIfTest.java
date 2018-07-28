
public class TestIfTest {

	public static void main(String[] args) {
		
		if(returnT()) {
			System.out.println("TestIfTest.enclosing_method() truee");
		
		}
		
		if(returnF()) {
			System.out.println("false");
		}
		
	}
	
	public static boolean returnT(){
		return true;
	}
	
	public static boolean returnF(){
		return false;
	}
	
}
