package sec01;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String user = in.nextLine();
		int userInt;
		if(user.equals("����")) {
			userInt = 0;
		}else if (user.equals("����")){
		userInt = 1;
		}else {
		userInt = 2;
	}
		int com =(int)(Math.random()*3);
		
		if (com == 0 && userInt == 1) {
			System.out.println("�� : ����, �� : ����, �̰���ϴ�.");
		}else if( com == 0 && userInt == 2 ) {
			System.out.println("�� : ��, �� : ����, �����ϴ�.");		
		}else if( com == 1 && userInt == 0) {
			System.out.println("�� : ����, �� : ����, �����ϴ�.");	
			
		}else if ( com == 1 && userInt == 2) {
			System.out.println("�� : ��, �� : ����, �����ϴ�.");	
		}else if ( com == 2 && userInt  == 0) {
			System.out.println("�� : ����, �� : ��, �̰���ϴ�.");	
		}else if ( com == 2 && userInt == 1  ) {
			System.out.println("�� : ����, �� : ��, �����ϴ�.");	
		}else {
			System.out.println("�����ϴ�.");	
		}
		
		
	}
}
	