package sec02;

import java.util.Scanner;

public class RpsGameExam {

	public static void main(String[] args) {
		
		//1. (int)(Math.random()*3)     0�ƴϸ� 1 �ƴϸ�2  int�� ����Ÿ�Ժ�ȯ
		//2. ��ĳ�ʸ� �̿��ؼ� ����ڰ� �� ������������ ����
		//3. if���� �̿��ؼ� ���� ���� ���� ������ �ٲ�
		//4.��ǻ�� ���� ����ڼ��� �� ��(if)
		//5. ����� ���  

		
		System.out.println("����,����.�� ���Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("����"));
		System.out.println("���α׷�����");
		
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("���������� �ϳ��Է��ϼ���.");	
		String user = in.nextLine();
		int userInt = 0;
		if(user.equals("����")) {
			
		}else if (user.equals("����")){
		userInt = 1;
		}else {
		userInt = 2;
	}
		int com =(int)(Math.random()*3);
		
		if (com == 0 && userInt == 1) {
			System.out.println("�� : ����, �� : ����, �̰���ϴ�.");
		}else if( com == 0 && userInt == 2) {
			System.out.println("�� : ��, �� : ����, �����ϴ�.");		
		}else if( com == 1 && userInt == 0) {
			System.out.println("�� : ����, �� : ����, �����ϴ�.");	
			
		}else if ( com == 1 && userInt == 2) {
			System.out.println("�� : ��, �� : ����, �����ϴ�.");	
		}else if ( com == 2 && userInt  == 0) {
			System.out.println("�� : ����, �� : ��, �̰���ϴ�.");	
		}else if ( com == 2 && userInt == 1) {
			System.out.println("�� : ����, �� : ��, �����ϴ�.");	
		}else {
			System.out.println("�����ϴ�.");	
		}
		
		
	}
}
