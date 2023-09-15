import java.util.GregorianCalendar;
public class E12C9Exercise5GregorianCalendar {
	public static void main (String[] args)
	{
		System.out.println("This program is all about calendar and dates \n");
		GregorianCalendar x = new GregorianCalendar();
		System.out.println("First we will show you current day, month and year");
		System.out.println("The current year  :  "+ x.get(GregorianCalendar.YEAR));
		int month = x.get(GregorianCalendar.MONTH);
		String [] months = {"January","February","March","April","May","June","July","August","September",
				              "October","November","December"};
		System.out.println("The current month : "+ months[month]);
		System.out.println("The current day   :  "+ x.get(GregorianCalendar.DAY_OF_MONTH) + "\n");
		x.setTimeInMillis(1234567898765L);
		System.out.println("Now we will show you the date after 1234567898765 milliseconds elapsed since January 1,1970");
		System.out.println("Year  :  "+ x.get(GregorianCalendar.YEAR));
		month = x.get(GregorianCalendar.MONTH);
		System.out.println("Month :  "+ months[month]);
		System.out.println("Day   :  "+ x.get(GregorianCalendar.DAY_OF_MONTH));
		
	}
   
}

