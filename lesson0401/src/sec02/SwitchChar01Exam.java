package sec02;

public class SwitchChar01Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'b';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("����� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b': 
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default:
			System.out.println("�մ��Դϴ�.");
		}
	}
}

/*
 * java v12 ���ʹ� �Ʒ��� ���� �����Ҽ��ִ�.
 * switch(grade){
 * case 'A', 'a' ,? {
 * }
 * case 'B', 'b'{ 
 * }
 * */
 