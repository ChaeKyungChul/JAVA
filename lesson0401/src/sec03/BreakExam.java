package sec03;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = (int)(Math.random()*6+1);
			System.out.println("컴퓨터가 선택한 주사위의 값을 알아 맞춰 보세요.");
			int userNum = sc.nextInt();
			if(num == userNum) {
				System.out.println("정답입니다.");
				break;
			}		
		}
		System.out.println("프로그램종료");
		sc.close();
	}

}
