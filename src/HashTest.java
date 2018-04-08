import java.util.HashMap;


public class HashTest {
	
	public static void main(String[] args) {
		
		HashMap<String, String> vd=new HashMap<String, String>();
		
		vd.put("abc", "pqr");
		
		System.out.println(vd.get("abc"));
		System.out.println(vd.get("123"));
	}

}
