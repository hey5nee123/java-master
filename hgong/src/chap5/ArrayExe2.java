package chap5;

public class ArrayExe2 {
public static void main(String[] args) {
	//������ ���� �� �ִ� �迭�� ����(ũ��� 10������ ������ ����).
	int [] intAry = new int[10]; //{10,20,30,40...100}
	for (int i =0;i< intAry.length;i++) {
			intAry[i]= (i+1) *10;// i* 10+10;
	}
	// ���
	int sum = 0; //50���� ū ���� ����.
	double avg = 0;
	int count = 0;
	for (int num : intAry) { //num�� inAry�� �����ϰڴ�
		System.out.println(num);
		
		if(50 < num ) {
		sum += num; //sum = sum + num;
		count++;
		} 
		//count = intAry.length/2;
	}
	avg = sum/ count;
	System.out.println("50���� ū ���� �հ� "+ sum);
	System.out.println("50���� ū ���� ��� "+ avg);
	}
}
