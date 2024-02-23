package sec01;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String user = in.nextLine();
		int userInt;
		if(user.equals("가위")) {
			userInt = 0;
		}else if (user.equals("바위")){
		userInt = 1;
		}else {
		userInt = 2;
	}
		int com =(int)(Math.random()*3);
		
		if (com == 0 && userInt == 1) {
			System.out.println("나 : 바위, 컴 : 가위, 이겼습니다.");
		}else if( com == 0 && userInt == 2 ) {
			System.out.println("나 : 보, 컴 : 가위, 졌습니다.");		
		}else if( com == 1 && userInt == 0) {
			System.out.println("나 : 가위, 컴 : 바위, 졌습니다.");	
			
		}else if ( com == 1 && userInt == 2) {
			System.out.println("나 : 보, 컴 : 바위, 졌습니다.");	
		}else if ( com == 2 && userInt  == 0) {
			System.out.println("나 : 가위, 컴 : 보, 이겼습니다.");	
		}else if ( com == 2 && userInt == 1  ) {
			System.out.println("나 : 바위, 컴 : 보, 졌습니다.");	
		}else {
			System.out.println("비겼습니다.");	
		}
		
		
	}
}
	