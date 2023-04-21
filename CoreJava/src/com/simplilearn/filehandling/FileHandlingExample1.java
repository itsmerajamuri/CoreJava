package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileHandlingExample1 {

	public static void main(String[] args) throws IOException {
		
		
		
		File f=new File("D:/pavan.txt");
		f.createNewFile();
		
		FileOutputStream fo=new FileOutputStream(f);
		
		fo.write("pavan.".getBytes());
		fo.close();
		byte b=67;
	    char a=(char)b;
	    System.out.println("pavan.".getBytes().toString());
	    FileInputStream fi=new FileInputStream(f);
	  while(fi.read()!=-1) { 
		  System.out.println( fi.read());
		  }
		
		

	}

}
