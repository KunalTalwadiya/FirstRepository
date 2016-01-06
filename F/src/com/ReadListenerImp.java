package com;

import java.io.IOException;

import javax.servlet.ReadListener;


public class ReadListenerImp implements ReadListener{

	@Override
	public void onAllDataRead() throws IOException {
		System.out.println("onAllDataRead");
		
	}

	@Override
	public void onDataAvailable() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("onDataAvailable");
	}

	@Override
	public void onError(Throwable arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
