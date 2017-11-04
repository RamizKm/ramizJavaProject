import java.awt.event.TextEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class NullCHeckClass {
	
	
	
	public static void main(String[] args) throws SQLException {
		//value coming from textbox
		String textFieldEmail = null;
		PreparedStatement pst=null;//ur code
		
		//value coming from text box
		if(textFieldEmail==null || textFieldEmail.trim().length()==0){
			System.out.println("please enter valid email id ");//display error message
		}
		
		ResultSet rs=pst.executeQuery();
		String email=null;
		while(rs.next()) {
			//result from db
			email=rs.getString("emailId");
			
			
		}
		//null check has not been added since above textFieldEmail valiidation is added.
		// if it is null, in above error message is displayed
		if((textFieldEmail.equals(email))) {
			System.out.println("nothing is changed");
		}else if(!textFieldEmail.equals(email)){
			System.out.println("email has been changed");
		}
			
		
		
	}

}
