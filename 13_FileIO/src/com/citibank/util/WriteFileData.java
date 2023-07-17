package com.citibank.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileData {
	private Writer writer;
	private int size;
	private char[] data;
	private String filedata; 
	
	public boolean writeData(File file, String data) {
		try {
			writer= new FileWriter(file,true);
			if(file.length() > 0)
			writer.write("\n");
			writer.write(data);
			return true;
		}
		catch (IOException e) {
			System.out.println("Not able to read file");
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Not able to close file");
				e.printStackTrace();
			}
		}
		return false;
	}
}
