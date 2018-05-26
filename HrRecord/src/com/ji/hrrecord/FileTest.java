package com.ji.hrrecord;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("."); // current directory is ~eclipse-workspace/HrRecord/. 
		System.out.println(dir.isDirectory());
		System.out.println(dir.getAbsolutePath());
 
	}

}
