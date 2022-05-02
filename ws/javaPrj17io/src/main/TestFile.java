package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestFile {
	
	public void test() {
		
		//���� ��ǲ ��Ʈ��
		
		//���� ��ü
		File f = new File("D:\\dev\\abc.txt"); //������ ��, ���� ���� �����������
		
		boolean result = f.isFile();
		System.out.println(result);
		
		//���Ͽ��� ������ �б�
		//1. ����
		//2. ��ǲ ��Ʈ�� (FileInputStream)
		
		//���� ...
		//1. ���ڰ� �ƴ϶� ���ڷ� �о�� >> char �� ĳ���� �ؼ� �ϴ� ó��
		//2. �ѱ��ڹۿ� �� ���� >> ???
		
		FileReader fr = null;
		try {
			int x = 1/0;
			fr = new FileReader(f);
			int data;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("������ ��ã�� �̤�");
		}catch (IOException e) {
			System.out.println("����� ���� �߻� !!!!!");
		}finally {
			//���� �߻� ���ο� ���� ���� ������ ������ �Ǿ�� �ϴ� �ڵ� �ۼ�
			System.out.println("close �� ����");
			try {fr.close();} catch (IOException e) {System.out.println("close �� ���� �߻�");}
		}
		
		
		
		
	}
	
	public void test2() {
		
		System.out.println("���Ͽ� �۾� �Է��ϱ�");
		
		String str = new Scanner(System.in).nextLine();
		//���Ͽ��ٰ� �۾� ����
		
		
		//1. ���� ���� ��� (���� ��ü ����)
		String path = "D:\\dev\\abc.txt";
		File f = new File(path);
		//2. �����̶� ���� (�����̶� ����� ��Ʈ��) ??? OutputStream (FileOutputStream)
		FileWriter fw = null; //finally ���� close �ؾ��ϹǷ�, ���⼭ ����
		try {
			fw = new FileWriter(f);
			//3. ��Ʈ�� �̿��ؼ� ������ ����
			fw.write(str);
			fw.flush();
		} catch (IOException e) {
			System.out.println("����� ���� �߻� !!!");
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}
	
	/*
	 * ������Ʈ�� Ȱ���ؼ� �Է¹ޱ�
	 * (BufferedReader) : ���ڿ� ó���ҰŴϱ� Reader ���Ű�, Buffer �� ����ϰ� ����
	 */
	public void test3() {
		
		//���� ��ü ����
		String path = "D:\\dev\\abc.txt";
		File f = new File(path);
		
		//��Ʈ�� ����
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
//			while(true) {
//				String s = br.readLine();
//				if(s == null) {
//					break;
//				}
//				System.out.println(s);
//			}
		} catch (FileNotFoundException e) {
			System.out.println("���� ��ã�� !!!");
		} catch (IOException e) {
			System.out.println("�дٰ� ������!!!");
		}
		
	}
	
	//test4 (�ǽ� �غ���)
	//BufferedWriter ����غ���

}//class





















