package chap3;

import java.util.*;

public class exam128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� 4
		int penNum = 534;
		int stuNum = 30;
		
		//�л� 1���� ������ ���� ����
		int ppsNum = penNum / stuNum;
		System.out.println(ppsNum);
		
		int rempNum = penNum % stuNum;
		
		System.out.printf("�л��� ���� �� :%d , ���� ���� �� : %d \n",ppsNum, rempNum);
		
		//���� 5
//		���� Ÿ�� ��ȯ
		//���� 6
		
		int value = 356;
		System.out.println((value / 100)*100);
		
		
		//���� 7 
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == 0.1) {
			System.out.print("10%�Դϴ�.");
		} else {
			System.out.println("10%�� �ƴմϴ�.");
		}
		//���� 8
		int Top =5;
		int Bottom = 10;
		int Height = 7;
		double area = ((Top + Bottom)*Height/ 2.0);
		System.out.println(area);
		
		//���� 9
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� :");
		double num1 = sc.nextDouble();
		System.out.print("�ι�° ��");
		double num2 = sc.nextDouble();
		double num3 = num1 / num2;
		
		if(num2 == 0.0) { 
				System.out.println(" ��� : ���Ѵ�" );
			
		}else {
			System.out.println("��� : "+num3);
			
		}
		int won = 10;
		int three = 3;
		int ilsa = 14;
		double result14 = won * won *Double.parseDouble(three+ "."+ ilsa);
		System.out.println("���� ����:"+result14);
		
		//11
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵�");
		String name = scanner.nextLine();
		
		System.out.print("�н�����");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(strPassword.equals("12345")){
				System.out.println("�α��� ����");
				}else { 
					System.out.println("�α��� ����:�н����尡 Ʋ��");
				}
		} else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}
		
	}

}
