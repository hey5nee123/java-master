package chap5;

// �������� ������ ������ ����
class Friend{
	String name; // �ʵ�
	int age; //�ʵ�
	double height; //�ʵ�
}
public class referenceExe1 {

	public static void main(String[] args) {
		//���� ������ ���� ���� ��� �� �ƴ϶� ���� ���� �ּҸ� ��� ����!
		Friend myFriend = new Friend(); //new => ��ü ����
		myFriend.name ="��ö��";
		myFriend.age = 20;
		myFriend.height = 178.3;
		
		/**Friend ourFriend = myFriend;
		
		myFriend.name ="ȫ�浿";
		
		System.out.println(ourFriend.name);
		System.out.println(ourFriend.age);
		System.out.println(ourFriend.height);*/
		
		Friend yourFriend = new Friend(); //new => ��ü ����
		yourFriend.name ="��ö��";
		yourFriend.age = 20;
		yourFriend.height = 178.3;
		
		System.out.println(myFriend == yourFriend); //�ּҰ� �� :false
		
		yourFriend = null;
		
		/**try {
			System.out.println(youFriend.name);
		}catch (Exception e) {
			System.out.println("null���� �����մϴ�");
		}*/
		// >���ܷ� ó���ϰڽ��ϴ�.
		
		//�⺻Ÿ��.
		int a = 10;
		int b = a;
		
		a = 20;
		System.out.println("b=" +b);
		System.out.println("a="+a);
		
		// ����Ÿ��: �ּҰ��� ������ ����.
		String name ="�ſ��"; //23dbdae34334
		String hobby ="����";
		
		String name1 = name;
		name1 = "�ſ��";  //new String ("�ſ��"); > �̰Ŷ� ���ϸ� false ;;
		System.out.println("name: " +name);
		System.out.println("name1: "+name1);
		
		System.out.println(name == name1); // == ->equals �޼ҵ� Ȱ��.

	} //main end

}// class end
