package main;

import java.util.*;

public class Test {
	
	/*
	 * 제네릭
	 * - (주로 컬렉션) 타입 제한을 위해 사용
	 * 사용예시 : List<String> = new ArrayList<String>(); 
	 * List<String> = new ArrayList<>();
	 */
	
	public void test() {
		
		List<Integer> al = new ArrayList<>();
		
//		al.add("asd"); //제네릭 때문에 안됨
		al.add(10);
		al.add(20);
		al.add(30);
		
		//리스트에 있는 모든 데이터 더한 값 출력 
		
//		int x1 = al.get(0);
//		int x2 = al.get(1);
//		int x3 = al.get(2);
//		
//		int result = x1 + x2 + x3;
//		System.out.println(result);
		
		int result = 0;
//		for(int i = 0 ; i < al.size(); i++)
		for(int elem : al) //향상된 for문 (컬렉션, 배열 모두 사용 가능)
		{
			int temp = elem;
			result += temp;
		}
		System.out.println(result);
		
	}

}//class
















































