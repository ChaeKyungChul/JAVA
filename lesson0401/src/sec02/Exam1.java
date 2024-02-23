package sec02;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc = new Scanner(System.in);
			System.out.println("주사위를 굴려서 숫자가 같은지 확인하기");
			String user = sc.nextLine();
			int me = 1;
			int com = (int)(Math.random()*6+1);
			if( me == com ) {
				System.out.println( "주사위와같습니다.");
			}else {
				if(me > com) {
					System.out.println("주사위가 더작습니다.");
				}else {
					System.out.println("주사위가 더 높습니다..");
				}
			}	
	}
}
