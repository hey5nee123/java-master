package chap5;

import java.util.Scanner;

public class StudentApp {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int studentNum = 0;
	int[] scores = null;
	String[] names = null;
	
	// 1. �л��� 2. �����Է� 3.������ 4. �м�(�ְ�����,���) 5. ����
	boolean run = true;
	while(run) {
		System.out.println("1.�л� �� 2. �����Է� 3. ������ 4.�м�(�ְ�����,���) 5.����");
		int menu =scn.nextInt(); //3 Enter. (�Է��� 3�� �о���̴� ��)
		scn.nextLine();
		switch(menu) {
		case 1:
			System.out.println("�л����Է�>>");
			studentNum = scn.nextInt();
			scores = new int[studentNum];
			names = new String[studentNum];
			break;
	    case 2:
	    	System.out.println("�����Է�>>");
	    	//for �ݺ�.
	    	for(int i =0; i<scores.length;i++) {
	    		System.out.println("names["+i+"]>>");
	    		names[i] = scn.nextLine();
	    		System.out.println("scores["+i+"]>>");
	    		scores[i] = scn.nextInt();
	    		scn.nextLine();
	    	}
	    	break;
	    case 3:
	    	System.out.println("������>>");
	    	for(int i =0; i<scores.length;i++) {
	    		System.out.println("�̸���"+ names[i] +", ������" + scores[i]+"\n");
	    	}
	    	break;
	    case 4:
	    	System.out.println("�м�>>");
	    	double avg = 0;
	    	int sum = 0;
	    	int maxScore = 0;
	    	String maxName = "";
	    	//for(int num :scores) {
	    	for(int i = 0; i < scores.length; i++) {
	    		sum += scores[i]; // sum = sum + num;
	    		if(maxScore < scores[i]) {
	    			maxScore =scores[i];
	    			maxName = names[i];
	    			}
	    		}
	    	avg = sum * 1.0 / scores.length;
	    		System.out.println(maxName+"�� �ְ������� " +maxScore +"  ���: " + avg);
	    	break;
	    case 5:
	    	System.out.println("����>>");
	    	run = false;
	    	break;
	    		
		} //  end of switch.
	} //end of while.
	System.out.println("end of prog");
	}
}
