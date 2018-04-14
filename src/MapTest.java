import java.util.HashMap;
import java.util.Map;


public class MapTest {
	
	public static void main(String[] args) {
		
	
		
		Map<String,String> ay=new HashMap<String, String>();
		Map<String,String> az=new HashMap<String, String>();
		
		
		ay.putAll(az);
		System.out.println("MapTest.main() ay line 18="+ay);
		
		Map<String,String> abc=new HashMap<String, String>();
		Map<String,String> xy=null;
		abc.putAll(xy);
		System.out.println("MapTest.main() abc="+abc.toString());
		
	
		
	}

}
