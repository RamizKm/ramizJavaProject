

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.log4j.Logger;

public class Abctest {
	
	static Logger log=Logger.getLogger(Abctest.class.getClass());
	
	
	public static void main(String[] args) {
		System.out.println("Abctest.main()");
		try {
		String st=null;
				
				st.length();
		}catch(Exception e) {
			log.error("rcvr rttot=",e);
			log.error("errjr="+ExceptionUtils.getStackTrace(e),e);
			
		}
		
		
		
	}

}
