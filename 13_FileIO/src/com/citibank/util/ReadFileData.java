package com.citibank.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	private Reader reader;
	private int size;
	private char[] data;
	private String filedata; 
	
	public String readCharByChar(File file) {
		try {
			reader = new FileReader(file);
			size = (int) file.length();
			data = new char[size];
			int tempdata = reader.read();
			int i = 0;
			while(tempdata != -1) {
//				System.out.println("Tempdata  = " + tempdata);
				data[i] = (char) tempdata;
//				System.out.println("Data[" + i + "] = " + data[i]);
//				if(data[i] == 's' || data[i] == 'S')
//					data[i] = 'r';
				i++;
				tempdata = reader.read();
			}
			filedata = new String(data);
//			filedata = filedata.replace('s', 'r');
			return filedata;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public String readData(File file) {
		try {
			reader= new FileReader(file);
			size = (int) file.length();
			data = new char[size];
			System.out.println("Before move = " + data);
			reader.read(data);
			System.out.println("After move " + data);
			filedata = new String(data);
			return filedata;
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not found");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Not able to read file");
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Not able to close file");
				e.printStackTrace();
			}
		}
		return null;
	}
}
