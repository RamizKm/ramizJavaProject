
public class ReturnTest {

	public static void main(String[] args) {
		new ReturnTest().test();
	}
	
	public int a() {
		System.out.println("ReturnTest.a()");
		return 1;
		
	}
	
	public int b() {
		System.out.println("ReturnTest.b()");
		return 2;
	}
	
	
	public int c() {
		System.out.println("ReturnTest.c()");
		return 3;
	}
	
	public void test() {
		a();
		b();
		c();
	}
	
	
	
	
}

