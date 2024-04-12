package com.masai.question07;

public class Common extends Thread {

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i+" currnet thread "+Thread.currentThread().getName()+" Priority is "+Thread.currentThread().getPriority());
		}
		
	}

}
