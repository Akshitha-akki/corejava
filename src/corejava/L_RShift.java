package corejava;

import java.util.Scanner;

public class L_RShift {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter Number");
		int v =s.nextInt(); //2
		int result1 = v << 1; // Left shift
		System.out.println("Left Shift : "+result1);
		int result2 = v>>>1;//  Right Shift 
		System.out.println(" Right Shift : "+result2);
	}

}
