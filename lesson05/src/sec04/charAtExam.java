package sec04;

import java.util.Scanner;

public class charAtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String hobby="";
		
		//if(hobby.equals("")) {
		//	System.out.println("��̸� �� �����ô°� �ǰ��� ���ƿ�.");
		//}
	

		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("�ֹι�ȣ�� �ڿ����ڸ����� -���� �Է��ϼ���");
			String gender = sc.nextLine();
			
			if(gender.length() == 7) {
				//"9901191"
				
			char s =gender.charAt(6);
			switch(s) {
			case '1' : case '3' :
				System.out.println("����� ���� �Դϴ�.");
				break;
			case '2': case '4':
				System.out.println("����� ���� �Դϴ�.");
				break;
			}
					
				break;
		}
		
			System.out.println("==============��=============");
			
			
		}
		
		//
		
	
		//int sc =  numbers.charAt(7);
		
		//if(num == 4 || num ==2 ) {
		//	System.out.println("����");
		////}else if(num == 1 || num ==3) {
		//	System.out.println("����");
			
		
		//}
		
	
	}

}
