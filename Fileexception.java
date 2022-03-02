package com.xworkz.Exception;
import java.io.*;
public class Fileexception { 
	public static void main(String[] args) {
		FileReader fileReader=new FileReader("Cat.java");
		BufferedReader bufferReader=new BufferedReader(fileReader);
		String fileData=null;
		while((fileData=bufferReader.readLine())!=null) {
			System.out.println(fileData);
		}
		try {
			bufferReader.close();
		}
		catch(IOException e) {
			System.out.println(e.getClass().getSimpleName()+"\t"+e.getMessage());
			
		}
	}

}
