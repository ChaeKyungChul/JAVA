package sec08;

public class ArrayStringExam {

	public static void main(String[] args) {
		
			String[] strArr = new String[3]; //�ڹٿ��� ������������ߴ�
			
			strArr[0] = "Java";
			strArr[1] = "Java";
			strArr[2] = new String("Java");
	
			System.out.println("0�� :"+ strArr[0] );
			System.out.println("0�� :"+ strArr[1] );
			System.out.println("0�� :"+ strArr[2] );   //���ο��������
			
			System.out.println(strArr[0]==strArr[1]);         //true   ���� ��ü�� �ּҸ� ����
			System.out.println(strArr[0]==strArr[2]);         // false  2����ü�� �ٸ� �ּҿ� ������
			
			System.out.println(strArr[0].equals(strArr[2]));   //Ÿ��Ȯ�� equals��,// ���ڿ��� ����, �ٸ��� equals()�޼ҵ� �̿�
	}
}
