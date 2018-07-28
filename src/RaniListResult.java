import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mysql.jdbc.PreparedStatement;


public class RaniListResult {
	
	
	public static void main(String[] args) throws SQLException {
		
		
		PreparedStatement pst=null;//existing seetting
		
		ResultSet set=pst.executeQuery();
		
		List<String> resultDBList=new ArrayList<String>();
		
		while(set.next()) {
			//from db you got maggi and bornvita
			resultDBList.add("maggi");
			//in next , suppose it will add bornvita
			resultDBList.add("bornvita");
			
			
		}
		
		//from front end you have list with 5 elements.
		
		List<String> frontEndList=new ArrayList<String>();
		frontEndList.add("wheat");
		frontEndList.add("bornvita");
		frontEndList.add("sugar");
		frontEndList.add("teapowder");
		
		///by substracting it, you will get element which are part of front list and not in resultdbList
		
		//List<String> misslingList=frontEndList.
				
				Set<String> setString=new HashSet<String>();
	
		
		
		
	}

}
