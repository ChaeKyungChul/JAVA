package sec06;

public class Logicalexam {

	public static void main(String[] args) {
		
		//char char1 = 'A';    // char charCode : 'A'
		
		//if('A' >= 65) {
		//	System.out.println("char1 =" + "charCode�� �빮���Դϴ�.");
		//}

		
		//1.     ���� A�� ���� charCode�� ��� 
		 // charCode�� 65���� ũ�ų� ������  "charCode�� �빮�� �Դϴ�."�� ����϶�.

		int charCode = 'A';
		if(( charCode >= 65) & (charCode <= 90)){
			System.out.println("�빮���Դϴ�.");
		}
		

	//	2. charCode�� 97�� 122���̿� ������ charCode �� �ҹ��� �Դϴ�.  �׷���������
	//	�ҹ��ڰ� �ƴմϴٸ� ����϶�. 
		if(( charCode >= 97) & (charCode <= 122)){
			System.out.println("�ҹ����Դϴ�.");
		}else {
			System.out.println("�ҹ��ڰ� �ƴմϴ�.");
		}
		
	//	3.  charCode�� 48�� 57���̿� ������ charCode �� ���� �Դϴ�.  �׷���������
	//	���ڰ� �ƴմϴ�.�� ����϶�. 
		
		if(( charCode >= 48) & (charCode <= 57)){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("���ڰ� �ƴմϴ�.");
		}
	}
}
