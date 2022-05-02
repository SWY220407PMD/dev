package com.kh.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginTest {
	
	private final String path = "D:\\dev\\user.txt";
	
	private Scanner sc = new Scanner(System.in);
	
	//�α���
	public void login() {
		
		//����ڷκ��� ���̵�, ��� �Է¹ޱ�
		System.out.println("===�α��� �� ID, PWD �Է��ϼ���===");
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("�н����� : ");
		String pwd = sc.nextLine();
		
		//���Ͽ��� ���̵�, ��� Ȯ���Ͽ�
		//�α��� ���� ���� �Ǵ��ϱ�
		
		//���ϰ�ü ����
		File f = new File(path);
		
		//��Ʈ�� ����
		// try with resource ������ ����ϸ�, close ó���� ���� �� �ʿ䰡 ����. 
		//(jdk ���� Ȯ���ϰ� ����)
		try (BufferedReader br = new BufferedReader(new FileReader(f))){
			
			boolean isLoginSuccess = false;
			
			while(true) {
				//���̵�,��� �б�
				String data = br.readLine(); // id/pwd
				//data�� null �̶��? ���� ������ �� ��������.
				if(data == null) {
					break;
				}
				//�о�� data ���� '/' ������ �ε��� �˾ƾߵ�
				int index = data.indexOf('/');
				String dataId = data.substring(0,index);
				String dataPwd = data.substring(index+1);
				
				//�Ǵ��ϱ�
				if(id.equals(dataId) && pwd.equals(dataPwd)) {
					System.out.println(dataId + " �� �α��� ���� !");
					isLoginSuccess = true;
					break;
				}
				
			}
			
			//�ѹ��� �α��� ���� ���ϸ�, ����� ��
			if(!isLoginSuccess) {
				System.out.println("�α��� ���� ...");
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("���� !!!");
		} catch (IOException e1) {
			System.out.println("IO ���� �߻� !!!");
		}
		
		
		
	}
	
	//ȸ������
	public void join() throws JoinException {
		System.out.println("ȸ������");
		System.out.print("ID : ");
		String id = sc.nextLine().trim(); //trim : ���ڿ� ���� ����
		System.out.print("PWD : ");
		String pwd = sc.nextLine().trim();
		
		//���̵�, �н����� �߿� '/' ������ ���� �߻���Ű��
		if(id.contains("/") || pwd.contains("/")) {
			throw new JoinException();
		}
		
		//�Է¹��� �����͸� ���Ͽ� �ֱ�
		File f = new File(path);
		
		//��Ʈ�� ����
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(f, true));
			bw.write(id);
			bw.write("/");
			bw.write(pwd);
			bw.write("\n");
			bw.flush();
		} catch (IOException e) {
			System.out.println("���ܹ߻�!!!");
		} finally {
			try {bw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}

}//class















