package com.ji.filestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {

//		// File Writing Ex
//		PrintWriter out = new PrintWriter(
//				new BufferedWriter(
//				new FileWriter(
//				new File(
//				new File("C:\\Users\\Ji\\Desktop"), 
//				"test.txt"))));
//		PrintWriter out1 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//		out.println("Write in file");
//		out1.println("write in console");
//		out.close();
//		out1.close();
		
		
//		//Sustem.err 에 대한 출력을 파일로 리디렉션
//		File dir = new File("C:\\Users\\Ji\\Desktop");
//		File file = new File(dir, "test1.txt");
//		FileOutputStream fos = new FileOutputStream(file, true);
//		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
//		PrintStream ps = new PrintStream(bos);
//		System.setErr(ps); //System.err 에 대한 리다이렉션
//		
//		System.out.println("print in console");
//		System.err.println("print in file");
//		
//		System.err.close();

		
//		//Write file for Object. it dosen't need design specific things. just use Serializable interface in the object.
//		FileReadWrite_Sub ap = new FileReadWrite_Sub();
//		ap.x = 100;
//		ap.y = 200;
//		
//		File dir = new File("C:\\Users\\Ji\\Desktop");
//		File file = new File (dir, "test2.txt");
//		FileOutputStream fos = new FileOutputStream(file);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		ObjectOutputStream oos = new ObjectOutputStream(bos);
//		oos.writeObject(ap);
//		oos.close();
//		bos.close();
//		fos.close();

		//Read the file for Object. 
		File dir = new File("c:\\Users\\Ji\\Desktop");
		File file = new File(dir, "test2.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object obj = null;
		try {
			obj = ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		bis.close();
		fis.close();
		
		FileReadWrite_Sub ap = (FileReadWrite_Sub)obj;
		System.out.println(ap.x);
		System.out.println(ap.y);
		
	}

}

class FileReadWrite_Sub implements Serializable {
	int x; 
	int y;
}