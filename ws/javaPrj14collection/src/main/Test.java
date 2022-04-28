package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Test {
	
	Person p1 = new Person("심원용", 20, 'M');
	Person p2 = new Person("심투용", 20, 'M');
	Person p3 = new Person("심삼용", 20, 'M');
	
	String s1 = "aaa";
	String s2 = "bbb";
	String s3 = "ccc";

	//List
	public void testList() {
		
		//ArrayList
//		ArrayList al = new ArrayList();
//		al.add(p1);
//		al.add(p2);
//		al.add(p3);
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		
//		System.out.println(al.get(0));
//		System.out.println(al.get(2));
//		System.out.println(al.get(5));
		
		//LinkedList
//		LinkedList list = new LinkedList();
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
		
		//Person , String 여러개를 한번에 관리
		//여러개 ? 배열
		Object[] oArr = new Object[6];
		oArr[0] = p1;
		oArr[1] = p2;
		oArr[2] = p3;
		oArr[3] = s1;
		oArr[4] = s2;
		oArr[5] = s3;
		
	}
	
	//Set
	public void testSet() {
		//HashSet
		//생성, 넣기, 꺼내기
		
		HashSet hs = new HashSet();
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		
	}
	
	//Map
	public void testMap() {
		
		//생성
		HashMap map = new HashMap();
		
		//넣기
		map.put("first", p1);
		map.put("second", p2);
		map.put("third", p3);
		
		//꺼내기
		System.out.println(map.get("first"));
	}
	
	
}//class






























