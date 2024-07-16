package com.javaex.ex02;

public class LowerThread extends Thread{

	@Override
	public void run() {		//start에 있는 run을 사용하기위해 우리식대로 run을 만들어야함
		
		for(char ch='a'; ch<='z';ch++) {		//소문자출력
			System.out.println(ch);
			try {
				Thread.sleep(1000); 			//잠깐 멈추기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
