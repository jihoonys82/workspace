package com.ji.filestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class AddressBook {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File dir = new File("c:\\Users\\Ji\\Desktop\\");
		File file = new File(dir, "AddressData.dat");
		Vector<AddressData> vc = new Vector<AddressData>();
		
		if(file.exists()) {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			vc = (Vector<AddressData>)ois.readObject();
			
			ois.close();
			bis.close();
			fis.close();
		}
		while(true) {
			System.out.print("1.Register   2.disply all data   3.exit = ");
			int x= System.in.read();
			System.in.read();
			System.in.read();
			if(x == '1') {
				AddressData ad = new AddressData();
				vc.add(ad);
				System.out.println("1 person registered");
			} else if(x =='2') {
				for(int i=0;i<vc.size();i++) {
					AddressData temp = (AddressData)vc.elementAt(i);
					temp.disp();
				}
			} else if(x == '3') {
				FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(vc);
				oos.close();
				bos.close();
				fos.close();
				System.exit(0);
			} else {
				System.out.println("wrong select");
			}
			
		}
	}

}
