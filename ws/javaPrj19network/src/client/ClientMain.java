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
		
		//Ŭ���̾�Ʈ
		System.out.println("Ŭ���̾�Ʈ ���� ~~~ !");
		
		//���� �� ���� ���� ���� ���ڷ� ����
		//port ��ȣ�� well-known ��Ʈ�� �����ϰ� ����� ��
		Socket s = new Socket("localhost", 12345); //localhost(==127.0.0.1) �� ��밡��
		
		//stream ���
		OutputStream os = s.getOutputStream();				//1 ����Ʈ
		OutputStreamWriter osw = new OutputStreamWriter(os);//2 ����Ʈ
		BufferedWriter bw = new BufferedWriter(osw); 		//������Ʈ������ ���� ���
		
		//�Է¹ް�, write ���ֱ�
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		
		bw.write(msg);
		bw.flush();
		
		//����� �ڿ� �ݳ�
		bw.close();
		
	}

}//class















