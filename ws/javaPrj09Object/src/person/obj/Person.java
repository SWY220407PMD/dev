package person.obj;

public class Person {
	
	//클래스 == data + method
	
	//데이터 == 필드 == 멤버변수 == 인스턴스변수 == 전역변수
	public String name;
	public int age;
	public double height;
	public double weight;
	public char gender; //Male , Female
	public String skin; //백,흑,황
	public String birth;
	public String location;
	
	//기능 == 동작 == 메소드
	public void walk() {
		System.out.println("뚜벅뚜벅...");
	}
	
	public void say() {
		System.out.println("안녕하세요");
	}
	
	public void eat() {
		System.out.println("음 ~ 맛있다");
	}
	
	//자기소개 메소드
	public void introduce() {
		//본인이 가진 모든 데이터들(변수==필드==전역변수==인스턴스변수) 출력
		System.out.println(this.name);
//		System.out.println(this.age);
//		System.out.println(this.height);
//		System.out.println(this.weight);
//		System.out.println(this.gender);
//		System.out.println(this.skin);
//		System.out.println(this.birth);
//		System.out.println(this.location);
	}

}//class



























