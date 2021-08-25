package com.logicprogram;

import java.util.Scanner;

public class CouponNumber {
	public static void couponNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of coupons:");
		int num = scan.nextInt();
		char[] s = "0123456789".toCharArray();

		System.out.println(s[1]);

		for (int i = 0; i < num; i++) {
			int random = (int) (Math.random() * 999999999); // to increase the value of math.random and storing it at
															// int.
			StringBuffer sb = new StringBuffer();
			while (random > 0) {
				sb.append(s[random % s.length]);
				random /= s.length;
			}

			String CouponCode = sb.toString();
			System.out.println("Coupon Code: " + CouponCode);
		}
	}
}


