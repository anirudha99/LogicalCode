package Junitprogram;

import java.util.Scanner;

public class util {

	//To convert integer into binary
	static int[] toBinary() {
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
		return stringToIntArray(bin);
	}


	//To convert string into integer array 
	static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	//To swap nibbles
	public static int[] swapnibbles(int[]arr) {
		int temp, j = arr.length - 4; //J keeps last 4 of array
		for (int i = 0; i < 4; i++) { 
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

	static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}

	static boolean powerOftwo(int number) {
		int power = 0;
		int division = number;
		while (division > 1) {
			division = division / 2;
			power++;
		}
		return number == (int) Math.pow(2, power);
	}

}



