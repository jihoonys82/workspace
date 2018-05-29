package com.ji.hrrecord;

//import java.io.BufferedReader;
import java.io.Serializable;


/**
 * Class for HRData object only containing person information
 * @author Ji
 *
 */
public class HRData implements Serializable {
	private String name;
	private String email;
	private String phone;
	private String photo;
	private String note; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public HRData() {
		
	}
	
	// Below is for console Input test.
//	private static transient BufferedReader in; 
//	static  {
//		in = new BufferedReader(new InputStreamReader(System.in));
//	}
//	
//	public HRData() throws IOException {
//		setName(in.readLine());
//		setEmail(in.readLine());
//		setPhone(in.readLine());
//		setPhoto(in.readLine());
//		setNote(in.readLine());
//	}
}
