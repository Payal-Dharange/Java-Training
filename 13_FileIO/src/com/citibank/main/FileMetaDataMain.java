package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileMetaData;

public class FileMetaDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path;
		System.out.println("Enter file/directory path");
		path=(new Scanner(System.in)).next();
		File file = new File(path);
		FileMetaData fileMetaData = new FileMetaData();
		fileMetaData.printmetadata(file);
	}

}
