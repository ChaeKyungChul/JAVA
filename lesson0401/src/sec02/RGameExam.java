package sec02;

import java.util.Scanner;

public class RGameExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ��Է��ϼ���");
		int num = sc.nextInt();
		if( num >= 60) {
			System.out.println("�հ�");
		}else {
			if(num < 60) {
				System.out.println("���հ�");
			}
		}	
	}
}
