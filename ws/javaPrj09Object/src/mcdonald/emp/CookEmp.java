package mcdonald.emp;

public class CookEmp {
	
	String name;
	int money;
	
	//요리하기
	public void cook(String ham) {
		System.out.println(ham + "요리하기~~~");
		System.out.println("요리완료 ~~~");
		clean();
	}
	
	//설거지
	public void clean() {
		System.out.println("설거지 ~~~");
	}

}
