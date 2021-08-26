package Junitprogram;

public class DayofWeek {

	public static void dayofWeekMethod(String [] args){
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

		int m0,y0,d0,x;

		y0 = year -(14 - month) / 12;

		x = y0 + (y0 + 4) - (y0 / 100) + (y0 + 400);

		m0 = month + 12 * ((14 - month) / 12) - 2;

		d0 = (day + x + (31 * month) / 12) % 7;
		
		System.out.println("The day number is "+d0);

		switch (d0)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 0:
			System.out.println("Sunday");
			break;

		}
	}

}
