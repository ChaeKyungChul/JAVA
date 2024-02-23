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
			System.out.println("원하는 메뉴의 번호 선택하세요.");
			System.out.println("1.더하기 | 2.빼기 | 3.곱하기 | 4.나누기 | 5.종료");
			System.out.println("*****************************************");
			System.out.println("선택 > ");
			
			String sec = sc.nextLine();
			
			int num = Integer.parseInt(sec);
			
			switch(num) {
			case 1:
				System.out.println("더하기");
				keyboard x = new keyboard(sc.nextLine(.add));
				break;
					  
			case 2:
				System.out.println("빼기");
			case 3:
				System.out.println("곱하기");
			case 4:
				System.out.println("나누기");
			case 5:
				System.out.println("종료");
				
			}
		}
		
	}

}
