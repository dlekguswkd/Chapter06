package com.javaex.ex02;

public class DigitThread extends Thread{

	@Override
	public void run() {		//start에 있는 run을 사용하기위해 우리식대로 run을 만들어야함
		
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
