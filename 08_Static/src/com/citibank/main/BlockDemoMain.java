package com.citibank.main;

import com.citibank.domain.BlockDemo;

public class BlockDemoMain {
	static {
		System.out.println("Static Block called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		BlockDemo blockdemo = new BlockDemo();
		BlockDemo blockdemo1 = new BlockDemo();
//		BlockDemo.show();
		blockdemo.display();
	}

}
