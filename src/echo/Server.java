package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
		
		//읽기 스트림 (실행되면 처음으로 메세지 받음)
		InputStream in=socket.getInputStream();
		InputStreamReader isr=new InputStreamReader(in, "UTF-8");
		BufferedReader br=new BufferedReader(isr);
		
		//쓰기 스트림
		OutputStream out=socket.getOutputStream();
		OutputStreamWriter osw=new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw=new BufferedWriter(osw);
		
		
		while (true) {
			
			//메세지 받기
			String msg=br.readLine();	//msg는 메세지 줄인말
			
			if(msg==null) {
				break;
			}
			
			System.out.println("받은메세지: "+msg);
			
			//메세지 보내기  (메세지 받은걸 돌려주기)
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
		}
		
		
		System.out.println("=================");
		System.out.println("<서버 종료>");
		
		//닫기
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();
		
	}

}
