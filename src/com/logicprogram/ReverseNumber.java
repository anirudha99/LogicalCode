package com.logicprogram;

import java.util.Scanner;

public class ReverseNumber {
	public static void reverseNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		int rev = 0, rem = 0;
		
		while(num!=0) {
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		
		System.out.println("Reverse number is : "+rev);
		scan.close();
	}
}
