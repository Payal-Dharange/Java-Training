package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.InputOutputStream;

public class InputOutputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path, filedata, filedata1;
		System.out.println("Enter path of file");
		Scanner scanner = new Scanner(System.in);
		path= scanner.nextLine();
		System.out.println("Enter file data to write");
		filedata = scanner.nextLine();
		File file = new File(path);
		InputOutputStream iostream = new InputOutputStream();
		if (iostream.writeFile(file, filedata)) {
			System.out.println("Write operation is ");
			filedata1 = iostream.readFile(file);
		}
		else
			System.out.println("Write operation failed");
		
	}

}
