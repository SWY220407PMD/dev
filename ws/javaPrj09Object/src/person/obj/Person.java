package person.obj;

public class Person {
	
	//Ŭ���� == data + method
	
	//������ == �ʵ� == ������� == �ν��Ͻ����� == ��������
	public String name;
	public int age;
	public double height;
	public double weight;
	public char gender; //Male , Female
	public String skin; //��,��,Ȳ
	public String birth;
	public String location;
	
	//��� == ���� == �޼ҵ�
	public void walk() {
		System.out.println("�ѹ��ѹ�...");
	}
	
	public void say() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public void eat() {
		System.out.println("�� ~ ���ִ�");
	}
	
	//�ڱ�Ұ� �޼ҵ�
	public void introduce() {
		//������ ���� ��� �����͵�(����==�ʵ�==��������==�ν��Ͻ�����) ���
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



























