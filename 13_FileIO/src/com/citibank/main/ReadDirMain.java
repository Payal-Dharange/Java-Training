package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;

public class ReadDirMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path, filedata;
		System.out.println("Enter file/directory path");
		path=(new Scanner(System.in)).next();
		File file = new File(path);
		if (file.isDirectory()) {
			File[] listoffiles = file.listFiles();
			for (File file2 : listoffiles) {
				if(file2.isFile()) {
				ReadFileData data = new ReadFileData();
				filedata = data.readCharByChar(file2);
				System.out.println("Name of file = "+ file2.getName());
				System.out.println(filedata);
				}
			}
		
		}
		
		}
	}


