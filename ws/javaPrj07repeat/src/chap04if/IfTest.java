package chap04if;

public class IfTest {
	
	//���ǹ�
	/*
	 * if, else-if, else
	 */
	
	//� ������ ������� �������� 0���� �Ǵ��ϱ�
	public void test() {
		int x = -1;
		
		if(x > 0) {
			System.out.println("���");
		}else if(x < 0) {
			System.out.println("����");
		}else {
			System.out.println("zero");
		}
	}

}
