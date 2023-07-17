package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.WriteFileData;

public class WriteFileDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path, filedata;
		System.out.println("Enter file/directory path");
		Scanner scanner = new Scanner(System.in);
		path= scanner.nextLine();
		System.out.println("Enter file data");
		filedata = scanner.nextLine();
		File file = new File(path);
		WriteFileData writerfiledata = new WriteFileData();
		if(writerfiledata.writeData(file, filedata)) 
			System.out.println("data written successfully -- check you file");
		else
			System.out.println("Write failed");
	}

}
