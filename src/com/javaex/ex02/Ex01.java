package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		//섞어쓰기
		Thread dThread= new DigitThread();	// 숫자출력
		dThread.start();	//이미 만들어져있는 start
		
		Thread lThread=new LowerThread();	// 소문자출력
		lThread.start();
		
		Thread uThread=new UpperThread();	// 대문자출력
		uThread.start();

	}

}
