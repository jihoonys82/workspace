package com.ji.hrrecord;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * HR Data input window
 * @author Ji
 * UI- comleted
 * Action - required
 */
public class InputRecord  {
	
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	
	JLabel lblIntro 	= new JLabel();
			
	JLabel lblName 		= new JLabel("Name");
	JTextField txtName	= new JTextField();
	
	JLabel lblEmail		= new JLabel("Email");
	JTextField txtEmail	= new JTextField();
	
	JLabel lblPhone		= new JLabel("Phone");
	JTextField txtPhone	= new JTextField();
	
	JLabel lblPhoto		= new JLabel("Photo");
	JTextField txtPhoto = new JTextField();
	JButton btnPhoto	= new JButton("Choose File");
	
	JLabel lblNote		= new JLabel("Note");
	JTextArea txtNote 	= new JTextArea();
	JScrollPane scrollNote	= new JScrollPane(txtNote); //Scrolling function for txtNote
	
	JButton btnSubmit	= new JButton("Submit");
	JButton btnCancel	= new JButton("Cancel");
	
	JLabel lblResult	= new JLabel();
	
	JFrame frame		= new JFrame("Record Input");

	
	InputRecord() {

		this.init();
		this.start();
		
	}
	
	//frame configuration
	private void init() {
		//Frame initialization 
		frame.setSize(800, 500);
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = frame.getSize();
		xpos = (int)(dimen.getWidth()/2 - dimen1.getWidth()/2);
		ypos = (int)(dimen.getHeight()/2 - dimen1.getHeight()/2);
		frame.setLocation(xpos, ypos);
		frame.setResizable(false);

		//setup layout 	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(lblIntro);
		panel.add(lblName);
		panel.add(txtName);
		panel.add(lblEmail);
		panel.add(txtEmail);
		panel.add(lblPhone);
		panel.add(txtPhone);
		panel.add(lblPhoto);
		panel.add(txtPhoto);
		panel.add(btnPhoto);
		panel.add(lblNote);
		panel.add(scrollNote);
		panel.add(btnSubmit);
		panel.add(btnCancel);
		panel.add(lblResult);
		
		//Set component size
		lblIntro.setBounds(10, 10, 390, 30);
		lblName.setBounds(50, 50, 50, 30);
		txtName.setBounds(100, 50, 290, 30);
		lblEmail.setBounds(50, 90, 50, 30);
		txtEmail.setBounds(100, 90, 290, 30);
		lblPhone.setBounds(50, 130, 50, 30);
		txtPhone.setBounds(100, 130, 290, 30);
		lblPhoto.setBounds(50, 170, 50, 30);
		txtPhoto.setBounds(100, 170, 290, 30);
		btnPhoto.setBounds(400, 170, 130, 30);
		lblNote.setBounds(50, 210, 50, 30);
		scrollNote.setBounds(100, 210, 290, 150);
		btnSubmit.setBounds(100, 370, 140, 30);
		btnCancel.setBounds(250, 370, 140, 30);
		
		//Introduction 
		lblIntro.setText("Please fill correct member record. All fields are required.");
		
		//Photo
		txtPhoto.setText("Select photo via \"Choose File\" button ==> ");
		txtPhoto.setEditable(false);
		
		//textNote 
		txtNote.setLineWrap(true);
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	private void start() {
		
	}
	
	private int writeRecord() throws IOException, ClassNotFoundException {
		if(nullCheck()) {
			HRData data = new HRData();
			data.setName(txtName.getText());
			data.setEmail(txtEmail.getText());
			data.setPhone(txtPhone.getText());
			data.setPhoto(txtPhoto.getText());
			data.setNote(txtNote.getText());
			
			HrIo io = new HrIo();
			io.fileWirte(data);
			
			return 1;
		} else {
			return -1;
		}
	}
	
	/**
	 * null chuck for all input cell. 
	 * @return if there is no null value return true.
	 */
	private boolean nullCheck() {
		if(txtName.getText() == null) return false;
		if(txtEmail.getText() == null) return false;
		if(txtPhone.getText() == null) return false;
		if(txtPhoto.getText() ==  null) return false;
		if(txtNote.getText() == null) return false; 
		return true;
	}
	
	/**
	 * Clear all input fields.
	 */
	private void clearFields() {
		txtName.setText("");
		txtEmail.setText("");
		txtPhone.setText("");
		txtPhoto.setText("Select photo via \"Choose File\" button ==> ");
		txtNote.setText("");
	}
}
