package person.main;

import person.obj.Person;

public class PersonMain {
	
	public static void main(String[] args) {
		
		System.out.println("PersonMain Ŭ������ main �޼ҵ� ȣ��� ...");
		System.out.println("====================================");
		
		// Person Ŭ������ �̿��ؼ�, ��ü�� ����
		// ������ ��ü�� ������ ����Ұ���. �׷��ϱ�,,, ����ϱ� ���ؼ�,,, ��򰡿� ��Ƶΰڽ��ϴ�.
		Person p1 = new Person(); //Ŭ������ Ÿ���� �� �� ����
		
		System.out.println("��ü �� ��������� Ȯ�� ::: " + p1);
		
		//��ü�� ������ �������� ~~~
		p1.walk();
		p1.say();
		p1.eat();
		
		//p1.name �� �ֱ�
		p1.name = "�ɿ���";
		System.out.println("p1.name ::: " + p1.name);
		
		//�ٸ� �� �ֱ�
		p1.name = "�ɿ���";
		p1.age = 20;
		p1.height = 183.7;
		p1.weight = 80.7;
		p1.gender = 'M'; //Male , Female
		p1.skin = "Ȳ";
		p1.birth = "01-01";
		p1.location = "���￪ 3�� �ⱸ 100m ����";
		
		p1.introduce();

	}//main

}//class























