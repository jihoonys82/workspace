package com.ji.hrrecord;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * HR Data input window
 * @author Ji
 *
 */
public class InputRecord  {
	
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	JLabel lName = new JLabel("Name");
	JLabel lClass = new JLabel("Class");
	JLabel lPhone = new JLabel("Phone");
	JLabel lNote = new JLabel("Note");
	JLabel lPhoto = new JLabel("Photo");
	
	JTextField tName = new JTextField();
	JTextField tClass = new JTextField();
	JTextField tPhone = new JTextField();
	JTextField tPhoto = new JTextField("Select picture");
	JTextArea tNote = new JTextArea();
	
	JButton bPhoto = new JButton("Photo select");

	JButton bSubmit = new JButton("Submit");
	JButton bCancel = new JButton("Cancel");
	
	
	InputRecord() {
		JFrame frame = new JFrame("Data Input");
		
		frame.setSize(800, 500);
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = frame.getSize();
		xpos = (int)(dimen.getWidth()/2 - dimen1.getWidth()/2);
		ypos = (int)(dimen.getHeight()/2 - dimen1.getHeight()/2);
		frame.setLocation(xpos, ypos);
		frame.setResizable(false);
		
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		frame.setLayout(grid);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.ipadx = 50;
		gbc.ipady = 20;
		frame.add(lName, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.ipadx = 100;
		frame.add(tName, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; 
		gbc.gridy = 1;
		gbc.ipadx = 50;
		frame.add(lPhone, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.ipadx = 100;
		frame.add(tPhone, gbc);		
				
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; 
		gbc.gridy = 2;
		gbc.ipadx = 50;
		frame.add(lClass, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.ipadx = 100;
		frame.add(tClass, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; 
		gbc.gridy = 3;
		gbc.ipadx = 50;
		frame.add(lNote, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.ipadx = 300;
		gbc.ipady = 100;
		frame.add(tNote, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; 
		gbc.gridy = 4;
		gbc.ipadx = 50;
		gbc.ipady = 20;
		frame.add(lPhoto, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.ipadx = 50;
		tPhoto.setEditable(false);
		frame.add(tPhoto, gbc);
		gbc.gridx = 2;
		gbc.ipadx = 20;
		frame.add(bPhoto, gbc);
		
		
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.ipadx = 30;
		frame.add(bSubmit, gbc);
		gbc.gridx = 2;
		gbc.ipadx = 30;
		frame.add(bCancel, gbc);
		
		
		this.init();
		this.start();
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	//frame configuration
	private void init() {
		
		
		
		
		
	}
	
	private void start() {
		
	}
}
