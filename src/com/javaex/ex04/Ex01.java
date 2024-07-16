package com.javaex.ex04;

public class Ex01 {
	public static void main(String[] args) {
		
		Runnable rAble01=new DigitRunnableImpl();
		Runnable rAble02=new LowerRunnableImpl();
		Runnable rAble03=new UpperRunnableImpl();
		
		//숫자출장
		Thread t01=new Thread(rAble01);
		t01.start();
		
		//대문자출장
		Thread t02=new Thread(rAble02);
		t02.start();
		
		//소문자출장
		Thread t03=new Thread(rAble03);
		t03.start();
		
		/*
		 Runnable rAble01=new DigitRunnableImpl();
		 Thread t01=new Thread(rAble01);
		 -------------------------------------------두문장을 한문장으로 대신 한번만 사용가능
		 Thread t01=new Thread(new DigitRunnableImpl());
		 */
		
	}

}
