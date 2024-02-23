package sec02;

import java.util.Scanner;

public class RGameExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		int num = sc.nextInt();
		if( num >= 60) {
			System.out.println("합격");
		}else {
			if(num < 60) {
				System.out.println("불합격");
			}
		}	
	}
}
