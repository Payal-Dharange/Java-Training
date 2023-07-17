package com.citibank.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriter {
	private Reader reader1;
	private BufferedReader reader2;
	
	private Writer writer1;
	private Writer writer2;
	
	String data = "";
	
	public boolean writeFile(File file, String data) {
		try {
			writer1 = new FileWriter(file,true);
			writer2 = new BufferedWriter(writer1);
			writer2.write("\n" + data);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				writer2.flush();
				writer1.flush();
				writer1.close();
				writer2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;	
	}
	
	public String readFile(File file) {
		try {
			reader1 = new FileReader(file);
			reader2 = new BufferedReader(reader1);
			String tempdata = reader2.readLine();
			while (tempdata != null) {
				data = data + tempdata + "\n";
				tempdata =reader2.readLine();
			}
			return data;				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				reader1.close();
				reader2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;	
	}
}
