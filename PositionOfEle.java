package com.kn.arrays.declaration;

import java.util.Scanner;

public class PositionOfEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int [] arr=new int [sc.nextInt()];
		System.out.println("Enter Elements* oa Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to fing position");
		int a=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==a) {
				System.out.println("position is : "+(i+1));
			}
			else {
				System.out.println("\uD83D\uDC7D");
			}
		}
	}
}
