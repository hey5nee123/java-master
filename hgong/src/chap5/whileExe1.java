package chap5;

import java.util.Scanner;

public class whileExe1 {
	public static void main(String[] args) {
		// for: 반복회수가 정해져 있는 경우.
		
		// while: 조건을 만족하는 동안 반복.
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("문자 값을 입력하세요!");
			String txt = scn.nextLine();
			if(txt.equals("quit")) {
				System.out.println("종료합니다");
				break;
			}
			System.out.println("입력값은 " + txt);
		}
		System.out.println("end of prog");
	}
}
