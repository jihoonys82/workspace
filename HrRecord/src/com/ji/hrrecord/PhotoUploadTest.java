package com.ji.hrrecord;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.lang.Character.Subset;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

public class PhotoUploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables for frame size and location
		Dimension dimen, dimen1;
		int xpos, ypos;
		
		// Variables for File
		String dName = ".//Photo";
		String fName= "Aileen.jpg";
		File dir = new File(dName);
		File file = new File(dir, fName);
				
				
		// swing components
		JFileChooser chooser = new JFileChooser();
		JLabel lblTest = new JLabel();
		JButton btnTest = new JButton();
		
		
		JFrame frame = new JFrame("Photo test");
		
		frame.setSize(800, 500);
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = frame.getSize();
		xpos = (int)(dimen.getWidth()/2 - dimen1.getWidth()/2);
		ypos = (int)(dimen.getHeight()/2 - dimen1.getHeight()/2);
		frame.setLocation(xpos, ypos);
		//frame.setResizable(false);

		//setup layout 	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
//		ImageIcon photoIcon = new ImageIcon(".//Photo//Aileen.jpg");
//		lblTest.setIcon(photoIcon);
//		panel.add(lblTest);
//		
//		lblTest.setBounds(10, 10, 780, 480);
//		
//		frame.add(panel);
//		
		panel.add(chooser);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileFilter filter = new FileFilter() {
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				String strDescription = "JPG, GIF, and PNG files only.";
				return strDescription;
			}
			
			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				String file = f.getName();
				String[] exts = file.split(".");
				String ext = exts[exts.length-1].toLowerCase();
				if(ext == "jpg" || ext == "gif" || ext == "png") return true;
				else return false;
			}
		};		
		chooser.setFileFilter(filter);
		
		chooser.setBounds(10,10,500,350);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
