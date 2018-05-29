package com.ji.hrrecord;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Vector;

public class HrIo {
	private static final String dirpath = ".\\Data";
	private static final String filepath = "hrdata.dat";
	File dir = new File(dirpath);
	File file = new File(dir, filepath);
	
	private Vector<HRData> dataSet = new Vector<>();
	
	public HrIo() {
	}
	
	public void fileWirte(HRData data) throws IOException, ClassNotFoundException {
		dataSet.add(data);
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(dataSet);
		
		oos.close();
		bos.close();
		fos.close();
		dataSet.clear();
	}
	
	public Vector<HRData> fileReadAll() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		dataSet =(Vector<HRData>)ois.readObject();
		
		ois.close();
		bis.close();
		fis.close();
		
		return dataSet;
	}
	
	public HRData fileRead(String name) throws IOException, ClassNotFoundException {
		HRData data = new HRData();
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		dataSet =(Vector<HRData>)ois.readObject();
		
		for(int i=0;i<dataSet.capacity();i++) {
			if(dataSet.get(i).getName() == name) {
				data= dataSet.get(i);
			}			
		}
		
		ois.close();
		bis.close();
		fis.close();
		dataSet.clear();
		
		return data;
	}
	
	
	public Vector<HRData> getQuizData() throws IOException, ClassNotFoundException {
		Vector<HRData> quizDataSet = new Vector<>();
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		dataSet =(Vector<HRData>)ois.readObject();
		
		ois.close();
		bis.close();
		fis.close();
		
		Random rand = new Random();
		for (int i=0;i<3;i++) {
			int index = rand.nextInt(dataSet.capacity());
			quizDataSet.add(dataSet.get(index));
		}
		return quizDataSet;
	}
	
}
