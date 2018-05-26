package com.codility.lesson;

public class L1_BinaryGap {
	public static void main(String[] args) {
		BinaryGap_Solution sol = new BinaryGap_Solution();
		
		System.out.println(sol.solution(328));
		
	}
	
}


class BinaryGap_Solution {
	public int solution(int N) {
		int maxcount = 0;
		int count = 0;
		//boolean tocken = false; 
		boolean firstcount = true;
		for(int i = N; i > 0 ;i=i/2) {
			
			if(i%2 == 0) {
				if(!firstcount)	count = count +1;
			} else {
				if(firstcount) firstcount=false;	
				if (count > maxcount) maxcount = count;
				count = 0;
			}
//			System.out.println("N:" +N);
//			System.out.println("tocken :" +tocken);
//			System.out.println("count :" +count);
//			System.out.println("maxcount :" + maxcount);
		}
		
		
//		while(N>1) {
//			if(N%2 == 1) { 
//				if(tocken) { 
//					if(firstcount) firstcount = false;
//					if(count>maxcount) maxcount = count;
//					count = 0; 
//					tocken = false;
//				} else {
//					tocken = true;
//				}
//			} else {
//				if(!firstcount) count++;
//			}
//			
//			N /= 2;
//			System.out.println("N:" +N);
//			System.out.println("tocken :" +tocken);
//			System.out.println("count :" +count);
//			System.out.println("maxcount :" + maxcount);
//		}
//		
//		if(count>maxcount) maxcount = count;
		
		
		return maxcount;
	}
	
}