package com.codility.lesson;

import java.util.HashMap;
import java.util.HashSet;

public class Chap1_Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
//		for_ex0(n);
//		for_ex1(n);
//		for_ex2(n);
//		for_ex3(n);
//		while_ex0(n);
//		while_ex1(n);
//		loopingCollection_ex1();
//		loopingCollection_ex2();
		loopingCollection_ex3();
	}
	
	public static void for_ex0(int n) { 
		for(int i=0;i<=n;i++) {
			System.out.print(i + "\t");
		}
	}
	
	public static void for_ex1(int n) {
		int factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial *= i;
			System.out.println("i : " + i + ", factorial : " + factorial);
		}
	}

	public static void for_ex2(int n) {
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void for_ex3(int n) { 
		for(int i=n;i>0;i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void while_ex0(int n) {
		int result = 0;
		while(n>0) {
			n /= 10;
			result++;
		}
		System.out.println("Number of iteration : " + result);
	}
	
	public static void while_ex1(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		while(a<=n) {
			System.out.println("a : " + a);
			c = a+b;
			a = b;
			b = c;
		}
	}
	
	public static void loopingCollection_ex1( ) {
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		System.out.println(days);
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]);
		}
		
		//foreach(String day in days)
		
		for(String day :days) {
			System.out.println(day);
		}
	}
	
	public static void loopingCollection_ex2( ) {
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		HashSet<String> dayset = new HashSet<>();
		
		//input data in HashSet
		for(String day :days) {
			dayset.add(day);
		}
		
		//output data
		for(String day : dayset) {
			System.out.println(day);
		}
		
	}
	
	public static void loopingCollection_ex3() {
		
		HashMap<String, String> days = new HashMap<>();
		days.put("mon", "Monday");
		days.put("tue", "Tuesday");
		days.put("wed", "Wednesday");
		days.put("thu", "Thursday");
		days.put("fri", "Friday");
		days.put("sat", "Saturday");
		days.put("sun", "Sunday");
		
		for(String daykey : days.keySet()) {
			System.out.println(daykey + " stands for " + days.get(daykey));
		}
		
	}
	
	
	
}
