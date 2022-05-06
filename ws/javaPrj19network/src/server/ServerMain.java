package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		
		// 서버
		
		//서버 소켓은 포트번호 필요
		ServerSocket ss = new ServerSocket(12345); 
		
		// accept 를 통해 클라이언트 소켓 정보 얻음
		System.out.println("다른 소켓의 연결을 기다리는 중 ...");
		Socket cs = ss.accept(); //쓰레드가 block 됨
		
		InetAddress ip = cs.getInetAddress();
		
		System.out.println("연결된 클라이언트의 ip : " + ip);
		
		// stream 얻기
//		InputStream is = cs.getInputStream(); 				//1 byte 씩 처리 하니까
//		InputStreamReader isr = new InputStreamReader(is);	//이제 2 byte 씩 처리 가능
//		BufferedReader br = new BufferedReader(isr);	    //보조스트림으로 성능 향상			
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(cs.getInputStream()));
		
		//메세지 읽고, 출력하기
		String msg = br.readLine();
		System.out.println(msg);
		
		//사용한 자원 반납
		br.close();

		
	}

}//class














