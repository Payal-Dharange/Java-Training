package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;
import com.citibank.util.WriteFileData;

public class CopyDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String copypath, filedata, pastepath;
		System.out.println("Enter path of file to copy its content");
		Scanner scanner = new Scanner(System.in);
		copypath= scanner.nextLine();
		File file = new File(copypath);
		ReadFileData data = new ReadFileData();
		filedata = data.readCharByChar(file);
		System.out.println("Enter path/directory where you want to paste file");
		pastepath= scanner.nextLine();
		file = new File(pastepath);
		if (file.isDirectory()) {
			pastepath = pastepath.concat("/copy.txt");
			System.out.println(pastepath);
		}
		file = new File(pastepath);
		WriteFileData writerfiledata = new WriteFileData();
		if(writerfiledata.writeData(file, filedata)) 
			System.out.println("data written successfully -- check you file");
		else
			System.out.println("Write failed");
		}
}
