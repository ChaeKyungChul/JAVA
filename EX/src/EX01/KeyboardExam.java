package EX01;

import java.util.Scanner;

public class KeyboardExam {

	public static void main(String[] args) {
		keyboard num1 = new keyboard();
		Scanner sc =new Scanner(System.in);
		
		int number =0;
		boolean run = true;
		
		while(run) {
			System.out.println("*****************************************");
			System.out.println("���ϴ� �޴��� ��ȣ �����ϼ���.");
			System.out.println("1.���ϱ� | 2.���� | 3.���ϱ� | 4.������ | 5.����");
			System.out.println("*****************************************");
			System.out.println("���� > ");
			
			String sec = sc.nextLine();
			
			int num = Integer.parseInt(sec);
			
			switch(num) {
			case 1:
				System.out.println("���ϱ�");
				keyboard x = new keyboard(sc.nextLine(.add));
				break;
					  
			case 2:
				System.out.println("����");
			case 3:
				System.out.println("���ϱ�");
			case 4:
				System.out.println("������");
			case 5:
				System.out.println("����");
				
			}
		}
		
	}

}
