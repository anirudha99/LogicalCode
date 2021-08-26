package Junitprogram;

import java.util.Scanner;

public class VendingMachine {
	
	static int I, TOTAL;
	static int[] NOTES = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	public static void vendingmachine() {

		System.out.println("Enter the change to be provided");
		Scanner sc = new Scanner(System.in);
		int change = sc.nextInt();
		notes(change);
		sc.close();
	}
	
	static void notes(int value) {
		if (value / NOTES[I] != 0) {
			TOTAL += (value / NOTES[I]);
			System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
			value = value % NOTES[I];
		}
		I++;
		if (value == 0) {
			System.out.println("total notes :" + TOTAL);
			return;
		}

		notes(value);

	}
}

