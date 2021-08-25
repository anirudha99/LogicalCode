package com.logicprogram;

import java.util.Scanner;

public class StopWatch {
	public static void stopwatchmethod() {
		double diff;
		System.out.println("Start the stop watch:");
		Scanner scn = new Scanner(System.in);
		
		//start timer
		double start = scn.nextDouble();
		start = System.currentTimeMillis();
		
		
		System.out.println("Stop the stop watch:");
		double stop = scn.nextDouble();
		stop = System.currentTimeMillis();
		
		if (stop == 0) {
			double now = System.currentTimeMillis();
			diff = now - start;
		} else {
			diff = stop - start;
		}
		
		System.out.println("elapsed time is: " + diff + "ms");
		
	}

}
