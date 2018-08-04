
public class SwitchClass {
	
	public static void main(String[] args) {
		
		test(0);
		test(1);
		test(2);
		test(10);
	System.out.println("test commit");
		
		
	}
	
	public static void test(int key) {
	
		
		switch (key) {
		case 0:
		case 1:
		default:
			System.out.println(" 0 1 and default");
			
			break;
			
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case3");
			break;
			
		}
		
	}

}
