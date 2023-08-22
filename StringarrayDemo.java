package com.kn.arrays.declaration;

import java.util.Scanner;

public class StringarrayDemo{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) {
		//Array Declaration 
		String[] arr;
		
		//Array Creation
		System.out.Println("Enter Array size = ");
		arr = new String[scan.nextInt()];
		
		
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter String data for element "+(i+1)+" = ");
		arr[i] = scan.next();
		}
		//array Traversing
		for(int i=0;i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
}
		