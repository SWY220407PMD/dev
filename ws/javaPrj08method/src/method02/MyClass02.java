package method02;

public class MyClass02 {
	
	// �޼ҵ� (method)
	// == �츮�� ���нð��� ��� �Լ� //f(x)
	
	/*
	 * �޼ҵ� �ۼ� ���
	 * ���������� ����Ÿ�� �޼ҵ�� (�Ű�����)     {������ ����,  ���ϰ��� �ִٸ� return ��}
	 * public   int    plusOne(int number){number++;   return number;}
	 * 
	 * - ���ϰ��� ������? void ��� �ۼ�
	 * - �Ű������� �ȹ޾Ƶ� �ǰ�, �������� �޾Ƶ� ��
	 * 
	 */
	
	/*
	 * �޼ҵ� ����
	 * �޼ҵ� ���(==�޼ҵ� �ñ״�ó) �޼ҵ� �ٵ�
	 * - �޼ҵ��� ��带 ����, �Է°��� ���� �� ��ȯ���� ���� �� �� �� �ִ�.
	 */
	
	public void test() {
		System.out.println("�׽�Ʈ �޼ҵ� ���� ~~~");
//		myMethod01();
//		plusTen(10);
//		System.out.println(getAge());
		
		//plusOne �޼ҵ带 ȣ���Ѵ�. (���� 10�� �������� ��)
		//ȣ���� ���� ���Ϲ��� ���� ����غ���
		int result = plusOne(10);
		System.out.println(result);
		
		System.out.println("�׽�Ʈ �޼ҵ� ���� ~~~");
	}
	
	//�Ű�����(��������� �ϴ� ��)�� ����, ���ϰ�(���� ��)�� ���� �޼ҵ�
	public void myMethod01() {
		System.out.println("�ȳ� ���� ��¹��̾� ����");
	}
	
	//����(����) �ϳ� ���޹޾Ƽ�, �� ���ڿ��ٰ� +10 �ؼ�, ����ϴ� �޼ҵ�
	//�Ű������� �ְ�, ���ϰ��� ���� �޼ҵ�
	public void plusTen(int x) {
		x = x+10;
		System.out.println(x);
	}
	
	//���� ���� �� ����(==��ȯ�ϴ� ==return �ϴ�) �޼ҵ�
	public int getAge() {
		System.out.println("getAge �޼ҵ� ȣ��� ~~~");
		return 20; //�ǵ��ư�
	}
	
	//���� �ϳ��� �Է¹ް�, +1 �� ���� ���� �ϴ� �޼ҵ�
	//�Է¹޴� ��(�Ű�����)�� �ְ�, ���� ��(==��ȯ�ϴ� ==return �ϴ�)�� �ִ� �޼ҵ�
	public int plusOne(int x) {
		x++;
		return x;
	}
	
	//�������� ����(����)�� �Է¹ް�, ���� ���̸� �����ϴ� �޼ҵ�
	//�Ű����� : ������
	//����Ÿ�� : �Ǽ��� ������ (float, double)
	//������ ���� : �������� �̿��Ͽ� ���� ���� ���
	public double calcCircle(int r) {
		double result = r * r * 3.14;
		return result;
	}
	
	
	
	
	
	
	
	
	

}//class



















