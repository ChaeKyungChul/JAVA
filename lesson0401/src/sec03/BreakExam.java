package sec03;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = (int)(Math.random()*6+1);
			System.out.println("��ǻ�Ͱ� ������ �ֻ����� ���� �˾� ���� ������.");
			int userNum = sc.nextInt();
			if(num == userNum) {
				System.out.println("�����Դϴ�.");
				break;
			}		
		}
		System.out.println("���α׷�����");
		sc.close();
	}

}
