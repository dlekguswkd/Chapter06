package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	//이클립스에서 실행해볼거임

	public static void main(String[] args) throws IOException{
		
		//소켓생성
		ServerSocket serverSocket=new ServerSocket();
		
		//바인드 ip=192.168.0.24   port=10001  여기에 프로그램 구동중
		serverSocket.bind(new InetSocketAddress("192.168.0.24", 10001));
		
		//서버시작
		System.out.println("<서버시작>");
		System.out.println("=====================");
		System.out.println("[연결을 기다리고 있습니다]");
		
		//클라이언트가 연결되면 accept()가 실행되고 소켓이 생긴다
		//socket은 종이컵전화기
		Socket socket=serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		
		
	}

}
