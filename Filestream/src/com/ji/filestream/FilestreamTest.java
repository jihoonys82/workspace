package com.ji.filestream;

import java.io.File;

public class FilestreamTest {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Ji\\Desktop\\test.txt");
		
		if(f.exists()) {
			f.deleteOnExit();
			System.out.println(f.getName());
			System.out.println(f.getPath());
			System.out.println(f.getParent());
			System.out.println(f.length());
		} else {
			System.out.println("file not found");
		}
		
		
	}
}
