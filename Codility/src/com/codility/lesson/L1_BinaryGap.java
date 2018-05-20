package com.codility.lesson;

public class L1_BinaryGap {
	public static void main(String[] args) {
		BinaryGap_Solution sol = new BinaryGap_Solution();
		
		System.out.println(sol.solution(529));
		
	}
	
}


class BinaryGap_Solution {
	public int solution(int N) {
		int maxcount = 0;
		int count = 0;
		for(int i = N; i > 0 ;i=i/2) {
			
			if(i%2 == 0) {
				count = count +1;
			} else {
				if (count > maxcount) maxcount = count;
				count = 0;
			}
		}
		return maxcount;
	}
	
}