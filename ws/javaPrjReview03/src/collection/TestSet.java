package collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public void test01() {
		Set<String> s = new HashSet();
		
		s.add("월");
		s.add("화");
		s.add("금");
		s.add("금");
		s.add("금");
		s.add("금");
		s.add("토");
		s.add("일");
		
		for(String temp : s) {
			System.out.println(temp);
		}
		
		System.out.println(s);
		
		
	}//test01

}//class
