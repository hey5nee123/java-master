package chap5;

import java.util.Scanner;

public class whileExe1 {
	public static void main(String[] args) {
		// for: �ݺ�ȸ���� ������ �ִ� ���.
		
		// while: ������ �����ϴ� ���� �ݺ�.
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("���� ���� �Է��ϼ���!");
			String txt = scn.nextLine();
			if(txt.equals("quit")) {
				System.out.println("�����մϴ�");
				break;
			}
			System.out.println("�Է°��� " + txt);
		}
		System.out.println("end of prog");
	}
}
