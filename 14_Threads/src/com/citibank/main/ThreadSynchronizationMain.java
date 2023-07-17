package com.citibank.main;

import com.citibank.domain.Receiver;
import com.citibank.threads.Caller;

public class ThreadSynchronizationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
//		receiver.getCall("Hi");
//		receiver.getCall("Hello");
//		receiver.getCall("How are you");
		Caller caller1 = new Caller(receiver, "Hi");
		Caller caller2 = new Caller(receiver, "Hello");
		Caller caller3 = new Caller(receiver, "How are you");
	}

}
