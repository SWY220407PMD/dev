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
	
	public void test2() {
		
		System.out.println("파일에 글씨 입력하기");
		
		String str = new Scanner(System.in).nextLine();
		//파일에다가 글씨 쓰기
		
		
		//1. 파일 정보 얻기 (파일 객체 생성)
		String path = "D:\\dev\\abc.txt";
		File f = new File(path);
		//2. 파일이랑 연결 (파일이랑 연결된 스트림) ??? OutputStream (FileOutputStream)
		FileWriter fw = null; //finally 에서 close 해야하므로, 여기서 선언
		try {
			fw = new FileWriter(f);
			//3. 스트림 이용해서 데이터 전송
			fw.write(str);
			fw.flush();
		} catch (IOException e) {
			System.out.println("입출력 예외 발생 !!!");
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}
	
	/*
	 * 보조스트림 활용해서 입력받기
	 * (BufferedReader) : 문자열 처리할거니까 Reader 쓸거고, Buffer 를 사용하고 싶음
	 */
	public void test3() {
		
		//파일 객체 생성
		String path = "D:\\dev\\abc.txt";
		File f = new File(path);
		
		//스트림 생성
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
			System.out.println("파일 못찾음 !!!");
		} catch (IOException e) {
			System.out.println("읽다가 에러남!!!");
		}
		
	}
	
	//test4 (실습 해보기)
	//BufferedWriter 사용해보기

}//class





















