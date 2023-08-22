package com.kn.arrays.declaration;

import java.util.Scanner;

public class DoubleArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration
		double[] arr ;
		
		//Array Creation
		System.out.println("Enter Array size  = ");
		int size = scan.nextInt();
		arr = new double[4];
				
		//Array Initialization
		for(int i=0; i<4;i++) {
			arr[i] = 10;
		}
		//Array Traversing
		for(int i=0;i<4;i++) {
			System.out.println(arr[3]);
		}
}
}
