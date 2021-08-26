package Junitprogram;

public class MonthPayment {
	
	public static void emimethod(String [] args){
		double principal = Float.parseFloat(args[0]);
		double rate = Float.parseFloat(args[1]);
		double year = Float.parseFloat(args[2]);
		
		double monthlyPay = 0.0;
		int months = (int) (12 * year);
		double r = (double) rate / (12 * 100);
		monthlyPay = (double) (principal * r) / (1 - Math.pow(1 + r, -months));
		System.out.println("Monthly payment is : "+ monthlyPay);
	}


}
