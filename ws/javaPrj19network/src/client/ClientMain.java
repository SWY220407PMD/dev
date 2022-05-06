package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//클라이언트
		System.out.println("클라이언트 시작 ~~~ !");
		
		//접속 할 서버 소켓 정보 인자로 전달
		Socket s = new Socket("127.0.0.1", 12345);
		
		//stream 얻기
		OutputStream os = s.getOutputStream();				//1 바이트
		OutputStreamWriter osw = new OutputStreamWriter(os);//2 바이트
		BufferedWriter bw = new BufferedWriter(osw); 		//보조스트림으로 성능 향상
		
		//입력받고, write 해주기
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		
		bw.write(msg);
		bw.flush();
		
		//사용한 자원 반납
		bw.close();
		
	}

}//class















