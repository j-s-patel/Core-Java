package com.jp.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//This program is about single dimensional arrays
/* There are 3 ways in which this approach is defined
 * approach 1. Simple counter increment by initializing a new array
 * approach 2. Assigning the array element at the time of taking input of array elements
 * approach 3. Using collections.reverse()
 * approach 4. Simply loop starting from last index to first
 */

//approach 1
/*
public class ReversingArray {
	static int[] reverseArray(int[] initialArray) {
		int initialSize = initialArray.length;
		int[] reverseArray = new int[initialSize];	
		int counter = 0;
		for(int i=initialSize-1; i>=0; i--) {
			reverseArray[counter++] = initialArray[i];
		}
		return reverseArray;
	}
	
	public static void main(String[] args) {
		int arraySize;
		int[] initialArray;
		Scanner sc = new Scanner(System.in);
		
		try {
			//input the size of array
			arraySize = sc.nextInt();
			
			//This line will skip the carriage return and will continue to take input
			sc.skip("(\r\n)?"); 
			
			initialArray = new int[arraySize];
			
			//space separated array elements will be converted to array using split() 
			//and delimiter is space passed as argument
			String[] stringArray = sc.nextLine().split(" "); 
			
			for(int i=0; i<arraySize; i++) {
				initialArray[i] = Integer.parseInt(stringArray[i]);  
			}
	
			int[] reverseArray = reverseArray(initialArray); 
			
			for(int i=0; i<arraySize; i++) {
				System.out.print(reverseArray[i] + " ");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		sc.close();	} } */

//approach 2
/*
public class ReversingArray {
	
	public static void main(String[] args) {
		int arraySize;
		int[] initialArray;
		Scanner sc = new Scanner(System.in);
		
		try {
			//input the size of array
			arraySize = sc.nextInt();
			
			//This line will skip the carriage return and will continue to take input
			sc.skip("(\r\n)?"); 
			
			initialArray = new int[arraySize];
			
			//space separated array elements will be converted to array using split() 
			//and delimiter is space passed as argument
			String[] stringArray = sc.nextLine().split(" "); 
			
			for(int i=0; i<arraySize; i++) {
				initialArray[arraySize - i -1] = Integer.parseInt(stringArray[i]); 
			}
			
			for(int i=0; i<arraySize; i++) {
				System.out.print(initialArray[i] + " "); 
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		sc.close(); }} */

//approach 3
/*
public class ReversingArray {
	
	static Object[] reverseArrayUsingCollections(int[] initialArray) {
		List<Integer> arrayList = new ArrayList<Integer>(); 
				
		//Used below lambda function (which is supported Java SE 8 and above
		Arrays.stream(initialArray).forEach((val) -> {
			arrayList.add(val);
		});
		
		//using collections.reverse() to reverse the order of elements
		Collections.reverse(arrayList);
		
		//toArray() will return the array of objects
		return arrayList.toArray();
	}

	public static void main(String[] args) {
		int arraySize;
		int[] initialArray;
		Scanner sc = new Scanner(System.in);
		
		try {
			//input the size of array
			arraySize = sc.nextInt();
			
			//This line will skip the carriage return and will continue to take input
			sc.skip("(\r\n)?"); 
			
			initialArray = new int[arraySize];
			
			//space separated array elements will be converted to array using split() 
			//and delimiter is space passed as argument
			String[] stringArray = sc.nextLine().split(" "); 
			
			for(int i=0; i<arraySize; i++) {
				initialArray[i] = Integer.parseInt(stringArray[i]);  
			}
			
			Object[] reverseArray = reverseArrayUsingCollections(initialArray);
			
			for(int i=0; i<arraySize; i++) {
				System.out.print(reverseArray[i] + " ");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		sc.close(); }} */

public class ReversingArray {
	
	public static void main(String[] args) {
		int arraySize;
		int[] initialArray;
		Scanner sc = new Scanner(System.in);
		
		try {
			//input the size of array
			arraySize = sc.nextInt();
			
			//This line will skip the carriage return and will continue to take input
			sc.skip("(\r\n)?"); 
			
			initialArray = new int[arraySize];
			
			//space separated array elements will be converted to array using split() 
			//and delimiter is space passed as argument
			String[] stringArray = sc.nextLine().split(" "); 
			
			for(int i=0; i<arraySize; i++) {
				initialArray[i] = Integer.parseInt(stringArray[i]);  
			}
			
			for(int i=arraySize-1; i>=0; i--) {
				System.out.print(initialArray[i] + " ");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		sc.close();	 	}}
