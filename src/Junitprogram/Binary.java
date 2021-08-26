package Junitprogram;

public class Binary {
	
	public static void binarymethod() {
		int[] binary = util.toBinary();
		
		for(int i=0;i<binary.length;i++) {
			System.out.println(binary[i]);
		}
		util.swapnibbles(binary);
		
		System.out.println("After swapping");
		for(int i=0;i<binary.length;i++) {
			System.out.println(binary[i]);
		}
		int swapDec = util.toDecimal(binary);
		System.out.println("Decimal of swapped binary is: "+swapDec);
		if (util.powerOftwo(swapDec))
			System.out.println("Number is power of 2");
		else
			System.out.println("Number is not a power of 2");
	}
}
