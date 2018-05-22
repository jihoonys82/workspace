package com.ji.filestream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class AddressData implements Serializable {
	private String name;
	private String email; 
	private String phone;
	private String address;
	static final long serialVersionUID = 1L;
	
	
	//transient keyword is that marks a member variable not to be serialized when it is persisted to streams of bytes.
	private static transient BufferedReader in;
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public AddressData() throws IOException {
		System.out.print("name = ");
		name = in.readLine();
		System.out.print("email = ");
		email = in.readLine();
		System.out.print("phone = ");
		phone = in.readLine();
		System.out.print("address = ");
		address = in.readLine();
	}
	
	public void disp() {
		System.out.print(name +"\t");
		System.out.print(email +"\t");
		System.out.print(phone +"\t");
		System.out.println(address);
	}
}
