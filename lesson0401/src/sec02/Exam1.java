package sec02;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc = new Scanner(System.in);
			System.out.println("�ֻ����� ������ ���ڰ� ������ Ȯ���ϱ�");
			String user = sc.nextLine();
			int me = 1;
			int com = (int)(Math.random()*6+1);
			if( me == com ) {
				System.out.println( "�ֻ����Ͱ����ϴ�.");
			}else {
				if(me > com) {
					System.out.println("�ֻ����� ���۽��ϴ�.");
				}else {
					System.out.println("�ֻ����� �� �����ϴ�..");
				}
			}	
	}
}
