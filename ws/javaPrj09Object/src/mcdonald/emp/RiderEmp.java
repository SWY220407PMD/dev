package mcdonald.emp;

public class RiderEmp {

	String name;
	int money;
	
	//배달하기
	public void delivery(String h) {
		System.out.println(h + "배달하기~~~");
	}
	
	//대기하기
	public void waiting() {
		System.out.println("대기하기~~~");
	}
}
