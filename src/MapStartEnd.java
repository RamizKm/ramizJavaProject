import java.util.HashMap;
import java.util.Map;


public class MapStartEnd {
	
	public static String PAGE_START="pageStart";
	public static String PAGE_END="pageEnd";
	
	public static void main(String[] args) {
		MapStartEnd obj=new MapStartEnd();
		Map<String,Integer> resultMap=obj.getStartEnd();
		int resultStart=0;
		int resultEnd = 0;
	//you can check whether key exists or not
		boolean pageStartExists=resultMap.containsKey(PAGE_START);
		if(pageStartExists) {
			resultStart=resultMap.get(PAGE_START);
			System.out.println("MapStartEnd.main() resultstart="+resultStart);
		}
	//similarly done for pageEnd
		boolean pageEndexists=resultMap.containsKey(PAGE_END);
		if(pageEndexists) {
			resultEnd=resultMap.get(PAGE_END);
		}
		System.out.println("MapStartEnd.main() resultstart-"+resultStart+" resultend="+resultEnd);
		//if key does not exist and you did map.get("kye"); nullpointerexception is thrown
	}
	
	public Map<String,Integer> getStartEnd() {
		//some db value from
		int startPage=3;
		int pageEnd=34;
		
		Map<String,Integer> pageMap=new HashMap<String, Integer>();
		
		pageMap.put(PAGE_START, startPage);
		pageMap.put(PAGE_END, pageEnd);
		
		return pageMap;
		
	}

}
