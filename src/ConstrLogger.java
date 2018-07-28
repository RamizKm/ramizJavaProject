import org.apache.log4j.Logger;


public class ConstrLogger {
	
	Logger log=Logger.getLogger(ConstrLogger.class);
	public ConstrLogger() {
		System.out.println("ConstrLogger.ConstrLogger()");
		log.error("error");
		log.warn("error");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("ConstrLogger.main()");
		new ConstrLogger();
	}

}
