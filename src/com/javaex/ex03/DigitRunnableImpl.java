package com.javaex.ex03;

public class DigitRunnableImpl implements Runnable {
	
	//필드
	
	//생성자

	//메소드 gs
	
	//메소드 일반
	@Override
	public void run() {
		//숫자출력
		for(int i=0;i<30; i++) {			//숫자출력
			System.out.println(i);
			try {
				Thread.sleep(1000); 		//잠깐 멈추기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
