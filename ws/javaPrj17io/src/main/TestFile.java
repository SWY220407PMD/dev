package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

}//class





















