package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * ���
		 * 
		 * 1. ���ǹ� (if, switch)
		 * 2. �ݺ���
		 */
		
		
		// ���ǹ� ( if , else, else~if ) , (switch , case, default, break)
		// ���ǿ� ������ ���� �ϰ� ����
		
		// if
		/*
		 * ǥ���� :
		 * if(���ǽ�){������ ����}
		 * 
		 * ���ǽĿ� �� ������ ??? 
		 * > true / false �� ���� �� �ֵ��� �ۼ�
		 */
		
		
		
		//else : �� �ٸ� , �׹ۿ�
		/*
		 * ǥ����
		 * if(���ǽ�){�����ҳ���}
		 * else {�����ҳ���}
		 * 
		 * else�� �տ��� if�� ����� ��쿡�� �� �� ����
		 * 
		 * ���� if ������ ������� ���ϸ�, ������ ���� ��
		 */
		
		
		
		//else ~ if
		/*
		 * ǥ����
		 * if(���ǽ�){�����ҳ���}
		 * else if(���ǽ�){�����ҳ���}
		 * else if(���ǽ�){�����ҳ���}
		 * .
		 * .
		 * .
		 * (������ ��� ����)
		 */
		
		
		// num �̶�� ������ �����,
		// ���� �ƹ��ų� ����ְ�,
		// num ���� ������? ����Դϴ�. ���
		// num ���� 0 �̶��? ZERO    ���
		// num ���� �������? �����Դϴ�. ���
		
//		int num = 0;
//		
//		if(num > 0) {
//			System.out.println("+");
//		}
//		else if(num < 0) {
//			System.out.println("-");
//		}
//		else if(num == 0) {
//			System.out.println("0");
//		}
		
		//switch
		/*
		 * ǥ���� : 
		 * switch(?){
		 *  case ? : ���౸��; 
		 *  case ? : ���౸��;
		 *  .
		 *  .
		 *  .
		 *  default : ���౸��;
		 *  }
		 */
		
		
		int x = 1;
		
		switch(x) {
		case 1 : System.out.println("��"); break;
		case 2 : System.out.println("��"); break;
		case 3 : System.out.println("��"); break;
		default : System.out.println("������ ����"); //else ���� Ű����
		}
		
		

	}

}
