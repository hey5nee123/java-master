package chap5;

public class array {
	public static void main(String[] args) {
		int a = 10;
		int[] ary = {10, 20, 33,25,34};
		int sum = 0;
		for(int i=0;i <= ary.length-1;i++) { //�迭�� ���̿� -1 ����� �� (���� �迭�� 0���� �����ؼ� or <= ���� < ����� �ȴ�
			sum +=  ary[i];   // sum = sum +ary[i];
		}System.out.println(sum);
		
		//*sum = ary[0]+ary[1]+ary[2];
		//System.out.println(" ary�� ���հ�� "+sum+"�Դϴ�");*/
		
		int [] intAry = new int[5];
		String[] names = new String[10]; //��������(����)
		System.out.println(intAry[0]);
		double[] heights = new double[3];
		System.out.println(heights[0]);  //���ڰ��� �ʱⰪ�� "0";
		names[0]= "ȫ�浿";
		names[1]= "�۰�"; //���� �ε����� ���� �� [] ���ȣ �ʼ�~~~
		names[2]= "������";
		System.out.println(names[0]);
		System.out.println(names[3]); // Ŭ�����Ͻ� �ʱⰪ�� "null"
		System.out.println(names[1]); // ><
	}
}
