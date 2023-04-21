package com.practiseDay1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import lombok.ToString;

public class FileHandling {
	

	public static void main(String[] args) throws IOException {
		
//       File file=new File("E:/2/pavan.txt");
//       System.out.println(file.createNewFile());
//       
//      if(!file.exists()) {
//    	  System.out.println(file.mkdirs());
//      }
//      FileOutputStream fileOutputStream=new FileOutputStream("e:/pavan");
//      fileOutputStream.write("pavan".getBytes());
//    //  files.c
//     
     Integer a=12;
     Integer.toString(a);
     String aa="pavan.png123.png";
    System.out.println( aa.lastIndexOf(aa.indexOf(".png")));
    System.out.println(aa.lastIndexOf("pa"));
    System.out.println(aa.lastIndexOf(".png"));
    
	}
	

}
