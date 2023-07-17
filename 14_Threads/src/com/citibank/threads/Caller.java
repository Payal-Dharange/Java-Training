package com.citibank.threads;

import com.citibank.domain.Receiver;

public class Caller implements Runnable{
	private Receiver receiver;
	private String message;
	private Thread thread;
	
	public Caller(Receiver receiver, String message) {
		super();
		this.receiver = receiver;
		this.message = message;
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		receiver.getCall(message);		
	}
}
