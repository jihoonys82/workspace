package com.javastudy.quiz;

import java.util.Scanner;

public class Roadrunner_Jihoon {
	
	// decide map width as static variable
	static int MAPWIDTH = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int location = 5; // initial location
		String keyinput = null; //for keyboard input
		boolean exitkey = false; //for while loop 
		
		Scanner sc = new Scanner(System.in); //Scanner method for move location
		
		System.out.println("A or a: move left, D or d: move right, Q or q: quit");
		
		while(!exitkey) // infinity loop until exitkey become true 
		{
			//draw map
			for(int i = 0;i<MAPWIDTH;i++) {
				if(i==location) { // indicate current location as "*" 
					System.out.print("*"); 
				} else { // other location is filled with "=" 
					System.out.print("=");
				}
			}
			
			//receive keyboard input
			keyinput =  sc.nextLine();
			
			switch (keyinput) {
				case "A" : //Upper case and... 
				case "a" : //lower case and... 
				case "¤±" : //Korean Input support
					//moveLeft method created by coder
					//You can see the detailed description when the mouse cursor is located on the method name!
					location = moveLeft(location);
					//location--;
					break;
				case "D" :
				case "d" :
				case "¤·" : 
					location = moveRight(location); 
					break; 
				
				case "Q" :
				case "q" :
				case "¤²" : 
					exitkey = true; 
					break;
			}
			
		} // end of while
		
		sc.close(); // close Scanner method for prevent memory leak.
	}
	
	/**
	 * Move the location 1 cell to left 
	 * @param location : put in current location 
	 * @return achanged location
	 */
	private static int moveLeft(int location) {
		if(location > 0) {
			location--;
		}
		return location;
		
	}
	
	/**
	 * Move the location 1 cell to right 
	 * @param location : put in current location 
	 * @return changed location
	 */
	private static int moveRight(int location) {
		if(location < MAPWIDTH - 1 ) {
			location++;
		}
		return location;
		
	}
}
