package chap5;

public class ArrayExe3 {
public static void main(String[] args) {
	String [] nameAry = {"ȫ�浿", "�۰�","������","������","ȫ�浿" };
	
	String search = "ȫ�浿";
	int count = 0;
	for(String i : nameAry) {
		if(i.equals(search)) {
			System.out.println(i);
			count++;
		}
		
	}
	
	
	System.out.println(search+"�� ��"+count+"�Դϴ�.");
	
	int[] scores = {88, 68, 72, 89, 92, 70};
	int maxScore = 0;
	for(int num : scores) {
		if(maxScore < num ) {
			maxScore = num;
		}
	}
	System.out.println(maxScore);
	
	} //main end
} //class end