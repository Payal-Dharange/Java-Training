package com.citibank.main;

import com.citibank.domain.ApplicationV2;

public class ApplicationV2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carInp = new String[5];
		carInp[0] = "scorpio";
		carInp[1] = "nexon";
		carInp[2] = "inova";
		carInp[3] = "thar";
		carInp[4] = "nano";
		ApplicationV2 app = new ApplicationV2(carInp);
		app.process();
		app.display();
	}

}
