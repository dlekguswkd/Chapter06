package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//숫자출력  출장보냈음
		//출장가서 실행하기
		//섞어쓰기
		Thread dThread =new DigitThread();		//dThred는 DigitThread 줄인말
		dThread.start();  	//run 쓰면 안됨 출장을 안감
	

		//문자출력
		for(char ch='A'; ch<='Z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000); 		//잠깐 멈추기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
