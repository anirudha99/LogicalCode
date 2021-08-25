package com.logicprogram;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibonaccimethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int n1 = 0,n2 = 1,i = 1;
		
		while(i<=num) {
			System.out.print(n1+" ");
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		sc.close();
	}
}
