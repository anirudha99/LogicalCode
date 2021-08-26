package com.logicprogram;

import java.util.*;

public class CouponNumber {

	public static Random random = new Random();  
	public static int num;
	public static ArrayList<Integer> coup_arr=new ArrayList<>(); 


	public static boolean process(int x)
	{
		int index = coup_arr.indexOf(x);
		if(index != -1)
		{
			coup_arr.remove(index);
			return true;
		}
		else 
			return false;
	}

	public static void couponNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of coupons:");
		int num = scan.nextInt();
		System.out.println("Enter the "+num+" distinct coupon numbers");
		for(int i=0;i<num;i++)
			coup_arr.add(scan.nextInt());

		int count=0,rand_number=0;
		while(count<num)
		{
			while(true)
			{
				int x=random.nextInt(10);
				rand_number++;
				boolean ps=process(x);
					break;
			}
			count++; 
		}
		System.out.println("Number of random numbers needed to process distinct coupon number is "+rand_number);
		scan.close();
	}
}	

