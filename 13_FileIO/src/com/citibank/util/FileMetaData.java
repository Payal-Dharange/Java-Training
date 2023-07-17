package com.citibank.util;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class FileMetaData {
	public void printmetadata(File file) {
		if(file.exists()) {
			System.out.println("Parent Folder = " + file.getParent());
			System.out.println("File AbsPath = " + file.getAbsolutePath());
			System.out.println("File Path = " + file.getPath());
			System.out.println("File Name = " + file.getName());
			System.out.println("File Size = " + file.length() + "bytes");
			Date date = new Date(file.lastModified());
//			DateFormat df = DateFormat.getDateInstance(date);
			System.out.println("Last accessed on = " + date);
//			System.out.println("Last accessed on = " + date.toLocaleString()));
			System.out.println("Can Read = " + file.canRead());
			System.out.println("Can Write = " + file.canWrite());
			System.out.println("Can Execute = " + file.canExecute());
			System.out.println("Is file = " + file.isFile());
			System.out.println("Is Directory = " + file.isDirectory());
			System.out.println("Is Hidden = " + file.isHidden());
		}
		else
			System.out.println("File does not exist");
	}
}
