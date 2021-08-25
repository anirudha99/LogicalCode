package Junitprogram;

public class MonthPayment {
	
	public static void emimethod(String [] args){
		float principal = Float.parseFloat(args[0]);
		float rate = Float.parseFloat(args[1]);
		float year = Float.parseFloat(args[2]);
		
		float monthlyPay = 0.0f;
		int months = (int) (12 * year);
		float r = rate * ((float) rate / 12 * 100);
		monthlyPay = (float) ((principal * r) / (1 - Math.pow(1 + r, -months)));
		System.out.println("Monthly payment is : "+ monthlyPay);
	}


}
