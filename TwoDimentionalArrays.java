package com.kn.arrays.declaration;

import java.util.Scanner;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[][][] arr=new int[2][2][2];
		//Array Initialization
		System.out.println("Enter data");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++);
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		//Array Traversing
		System.out.println("Array elements are as follows;");
		for(int i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}
}