package chap1;

import java.util.Scanner;
// ctrl + shift + o

public class Hello {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello, java");
		
		int x = 5;
		int y = x + 10;
		System.out.println(y);
		
		double z = 3.5;
		System.out.println(z);
		System.out.println("y = " +y);
		
		//������ �� ��ȯ
		x = 3;
		y = 10;
		//�� ��ȯ
		int c = x;
		x = y;
		y = c;
		//�� ���
		System.out.println("x =" + x);
		System.out.println("y =   "+ y);
		System.out.println(0b1011);
		
		
		// �⺻Ÿ��
		// ũ�� ���� byte< short< char(����ǥ�� x)< int< long
		char charData = 'a';
		int intData = charData;
		//���� Ÿ���� �ƴ϶� ����Ÿ�� 
		System.out.println("char : " +charData + ", int :  " + intData);
		
		char c1 = 'a';
		int c2 = c1 + 2; // ���� ����� �ڵ�Ÿ�Ժ�ȯ
		char c3 = (char)c2; //���� Ÿ�� ��ȯ ��Ŵ
		System.out.printf("c2�� ���� %d, c3�� ���� %s \n",c2,c3);
		x = 5;
		y = 2;
		double result = (double)x / y;
		//x�� y�� (double)�� �ֱ�(������ȯ)
		System.out.println(result);
		double var1 = 3.5;
		double var2 = 2.7;
		int result2 = (int)(var1 + var2);
		System.out.println(result2);
		
		long let1 = 2L;
		float let2 = 1.8f;
		double let3 = 2.5;
		String let4 = "3.9";
		int result3 = (int)(let1 + let2 + let3) + (int)Double.parseDouble(let4);
		System.out.println(result3);
		
		
	 	//ǥ�� �Է� : Ű���� => System.in.read();
		//�� ���ڸ� �о��
		
//		int keyCode;
//		
//		while(true){
//			keyCode = System.in.read();
//			System.out.println("keyCode : "+ keyCode);
//			if(keyCode == 113) {
//				break;
//				}
//			}
//		System.out.println("����");
//		
		// ���ڿ� �Է� => Scanner class -> ��ü ���� �ؼ� ���
		String scinput;
		Scanner sc = new Scanner(System.in);
		while(true) {
			//ctrl + shft + o -> import �ϴ� Ű
			System.out.print("�̸� �Է�:");
			//Scanner�� �Է� �������� ���� ��� ������ �־��
			scinput = sc.nextLine();
			if(scinput.equals("q")) {
				//�ݵ�� �˾Ƴ���!
				break;
			}
			System.out.println("�� �̸��� "+ scinput);

		}
		System.out.println("����");
		
		System.out.println("�� �Է�");
		scinput = sc.nextLine();
		System.out.println(Integer.parseInt(scinput) + 10);
		//���ڸ� ������
	
		
		
		
		
		
		sc.close();
		//scanner�� ����� �� ����� �� X
		
		
	} //end main
} //end class
		