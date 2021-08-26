package Junitprogram;

import java.util.Scanner;

public class toBinary {

	public static void toBinarymethod() {
		System.out.println("Enter the integer: ");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		String bin = "";
		while (d != 0) {
			bin = (d % 2) + bin;
			d /= 2;
		}
		while (bin.length() % 4 != 0) {
			bin = 0 + bin;
		}
		System.out.println("Binary number: "+bin);
		sc.close();
	}
}
