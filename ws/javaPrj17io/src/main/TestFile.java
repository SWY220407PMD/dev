package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
	
	public void test() {
		
		//파일 인풋 스트림
		
		//파일 객체
		File f = new File("D:\\dev\\abc.txt"); //생성할 때, 파일 정보 전달해줘야함
		
		boolean result = f.isFile();
		System.out.println(result);
		
		//파일에서 데이터 읽기
		//1. 파일
		//2. 인풋 스트림 (FileInputStream)
		
		//문제 ...
		//1. 문자가 아니라 숫자로 읽어옴 >> char 로 캐스팅 해서 일단 처리
		//2. 한글자밖에 못 읽음 >> ???
		
		FileReader fr = null;
		try {
			int x = 1/0;
			fr = new FileReader(f);
			int data;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("파일을 못찾음 ㅜㅠ");
		}catch (IOException e) {
			System.out.println("입출력 예외 발생 !!!!!");
		}finally {
			//예외 발생 여부와 관계 없이 무조건 실행이 되어야 하는 코드 작성
			System.out.println("close 함 ㅎㅎ");
			try {fr.close();} catch (IOException e) {System.out.println("close 중 예외 발생");}
		}
		
		
		
		
	}

}//class





















