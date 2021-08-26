package Junitprogram;

public class SQRT {
	
	public static void sqrtmethod(String []args) {
		int number=Integer.parseInt(args[0]);
		double epslion = 1e-15;
		double t = number;

		while (Math.abs(t - number / t) > epslion * t) {
			t = (number / t + t) / 2;
		}
		System.out.println("Sqrt is : "+ t);
	}

}
