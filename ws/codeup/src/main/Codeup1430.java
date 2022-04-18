package main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1430 {

	public static void main(String[] args) throws IOException {
		
		//입력 예시
//		5
//		2 52 23 55 100
//		4
//		5 2 55 99
		
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int memo[] = new int[10000001]; //0 ~ 10,000,000
		
		int n = sc.nextInt();
		
		int i;
		for(i = 0 ; i < n; ++i) {
			memo[sc.nextInt()] = 1;
		}
		
		int m = sc.nextInt();
		for(i = 0; i < m; ++i) {
//			System.out.print(memo[sc.nextInt()] + " ");
			bw.write(memo[sc.nextInt()] + " ");
		}
		
		bw.flush();
		bw.close();

	}

}
