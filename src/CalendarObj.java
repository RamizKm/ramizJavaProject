import java.util.Calendar;


public class CalendarObj {
	
	public static void main(String[] args) {
		System.out.println("CalendarObj.main()");
		
		Calendar d=Calendar.getInstance();
		System.out.println(d);
		System.out.println(d.getTime().getTime());
	}

}
