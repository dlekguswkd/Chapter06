package com.javaex.ex03;

public class Ex01 {
	
	public static void main(String[] args) {
	
		//숫자출력
		Runnable dr= new DigitRunnableImpl();	//실행코드가 있다
		
		//Thread thread= new Thread(new DigitRunnableImpl()); 위아래 두문장을 한줄로
		Thread thread= new Thread(dr);
		thread.start(); 	//출장기능 있음, 해야할일이 있다

		
		//문자출력
		for(char ch='A'; ch<='Z';ch++) {		//대문자 출력
			System.out.println(ch);
			try {
				Thread.sleep(1000); 			//잠깐 멈추기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 해야할일 Runnable 을 구현해야한다
		 -> run 메소드를 작성해라
		 -> 해야할일은 run 메소드에 작성해라
		 
		 Thread() 생성자에 runnable 을 파라미터로 전달
		 -> Thread thrread01 = new Thread(run을 구현한 애의 주소)
		 -> Thread thrread01 = new Thread(runnable을 구현한 애의 주소)
		 */
		
	}
}
