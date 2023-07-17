package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;

public class ReadFileDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path, filedata;
		System.out.println("Enter file/directory path");
		path=(new Scanner(System.in)).next();
		File file = new File(path);
		if(file.exists()) {
		ReadFileData data = new ReadFileData();
		filedata = data.readCharByChar(file);
		System.out.println(filedata);}
		else 
			System.out.println("File does not exist on given path");
	}

}
