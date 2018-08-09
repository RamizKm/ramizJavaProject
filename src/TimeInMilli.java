import java.util.Calendar;


public class TimeInMilli {

	
	public static void main(String[] args) {
		
		long timeInMill=Calendar.getInstance().getTimeInMillis();
		System.out.println("TimeInMilli.main() timeinmili="+timeInMill);
		String strLong=String.valueOf(timeInMill);
		System.out.println(strLong +" length="+strLong.length());
		
		
	}
	
}

