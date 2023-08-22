package com.kn.arrays.declaration;

import java.util.Scanner;

public class JuneBatch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Array Declaration& CreationṢ
	System.out.println(" enter th batch :");
	String[][] arr = new String[sc.nextInt()][];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("enter the batch A" + (i + 1)+"best frinds = ");
		arr[i] = new String[sc.nextInt()];
		
	}
	// Initialization
	for (int i = 0; i < arr.length; i++) {
		System.out.println("A" +(i+1)+"batch:");
		System.out.println("I have " + arr[i].length + "friends");
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("enter the " + (j + 1)+"friends name =");
			arr[i][j] = sc.next();
		}
	}
	//Traversing
	for(int i =0; i < arr.length; i++) {
		System.out.println("A" + (i + 1) + "friends");
		for(int j =0; j < arr[i].length; j++) {
			System.out.println((j + 1) + ":"+ arr[i][j]);
		}
	}
	sc.close();
	}
}
