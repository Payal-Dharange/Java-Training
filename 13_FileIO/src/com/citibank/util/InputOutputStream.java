package com.citibank.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStream {
	private InputStream inputstream;
	private OutputStream outputstream;
	private int size;
	private byte[] data;
	public String readFile(File file) {
		try {
			inputstream = new FileInputStream(file);
			size = (int) file.length();
			data = new byte[size];
			inputstream.read(data);
			String tempdata = new String(data);
			return tempdata;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				inputstream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;	
	}
	public boolean writeFile(File file, String data) {
		try {
			outputstream = new FileOutputStream(file,true);
			this.data = data.getBytes();
			outputstream.write("\n".getBytes());
			outputstream.write(this.data);
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				outputstream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;		
	}
}
