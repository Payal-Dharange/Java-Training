package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.BufferedReaderWriter;

public class BufferedReaderWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path, filedata, filedata1;
		System.out.println("Enter path of file");
		Scanner scanner = new Scanner(System.in);
		path= scanner.nextLine();
		System.out.println("Enter file data to write");
		filedata = scanner.nextLine();
		File file = new File(path);
		BufferedReaderWriter bufferedReaderWriter = new BufferedReaderWriter();
		bufferedReaderWriter.writeFile(file, filedata);
		System.out.println();
		filedata1 = bufferedReaderWriter.readFile(file);
		System.out.println(filedata1);
	}

}
