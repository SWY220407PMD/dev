package practice;

public class Practice {
	
	public void test() {
		System.out.println("practice start ~~~");
//		printHelloWorld();
		System.out.println("practice end ~~~");
	}
	
	//hello world ��� ����ϴ� �޼ҵ� �ۼ� //�޼ҵ� �̸� : printHelloWorld
	public void printHelloWorld() {
		System.out.println("Hello World");
	}
	
	//�޼ҵ�� : printMyName
	//�Է°� : ����
	//��ȯ�� : ����
	//���೻�� : ���� �̸� ���
	public void printMyName() {
		System.out.println("�ɿ���");
	}

	
	//�޼ҵ�� : multiple
	//�Է°� : ����
	//��ȯ�� : ����
	//���� ���� : (�Է¹��� ���� * 2) �� ���� ���
	public void multiple(int x) {
		System.out.println(x * 2);
	}
	
	
	//�޼ҵ�� : getName
	//�Է°� : ����
	//��ȯ�� : �����̸� (�ɿ���)
	//���೻�� : ���� (��ȯ�� �Ͻø� �˴ϴ�)
	public String getName() {
		return "�ɿ���";
	}
	
	
	//�޼ҵ�� : plus
	//�Է°� : ���� 2��
	//��ȯ�� : 2�� ������ ���� ��
	//���� ���� : ���� (��ȯ�� �Ͻø� �˴ϴ�.)
	public long plus(int a, int b) {
		return a+b;
	}
	
	//���� 4�� �޼ҵ� �ۼ� �� �ϸ�,
	//call by value , call by ref �����غ���
	
	
	
	
	
	
	
	
	
	
	
	
}//class
