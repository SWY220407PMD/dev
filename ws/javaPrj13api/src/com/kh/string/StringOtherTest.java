package com.kh.string;

public class StringOtherTest {

	//문자열 관련 3가지
	
	//1. String
	//2. StringBuffer
	//3. StringBuilder
	
	public void test() {
		//String
		String str = new String("zzz");
		String str2 = "zzz";
		str += "123";
		
		//StringBuffer
		StringBuffer sb = new StringBuffer("buffer~~~");
		sb.append("123");
		System.out.println(sb);
		
		//StringBuilder
		StringBuilder sbd = new StringBuilder("builder~~~");
		sbd.append("123");
		System.out.println(sbd);
	}
	
}//class

























