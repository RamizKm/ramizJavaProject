import java.util.HashMap;
import java.util.Map;


public class MapTestKey {
	
	public static void main(String[] args) {
		
		Map<String,String> abc=new HashMap<String,String>();
		abc.put("abc", "abc");
		
		boolean result=abc.containsKey("def");
		System.out.println("MapTestKey.main() rest="+result);
		
		System.out.println("MapTestKey.main() abc="+abc);
		abc.remove("abc");
		
		System.out.println("MapTestKey.main() abc="+abc);
		
	}

}
