package com.javaex.ex01;

public class DigitThread extends Thread{

	@Override
	public void run() {		//무조건 run이라는 단어로 만들어야함
		
		for(int i=0;i<30; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); 		//잠깐 멈추기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

	
	
	
}
