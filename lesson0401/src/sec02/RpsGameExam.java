package sec02;

import java.util.Scanner;

public class RpsGameExam {

	public static void main(String[] args) {
		
		//1. (int)(Math.random()*3)     0아니면 1 아니면2  int는 강제타입변환
		//2. 스캐너를 이용해서 사용자가 낼 가위바위보를 정함
		//3. if문을 이용해서 가위 바위 보를 정수로 바꿈
		//4.컴퓨터 숫자 사용자숫자 를 비교(if)
		//5. 결곽밧 출력  

		
		System.out.println("가위,바위.보 중입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("가위"));
		System.out.println("프로그램종료");
		
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("가위바위보 하나입력하세요.");	
		String user = in.nextLine();
		int userInt = 0;
		if(user.equals("가위")) {
			
		}else if (user.equals("바위")){
		userInt = 1;
		}else {
		userInt = 2;
	}
		int com =(int)(Math.random()*3);
		
		if (com == 0 && userInt == 1) {
			System.out.println("나 : 바위, 컴 : 가위, 이겼습니다.");
		}else if( com == 0 && userInt == 2) {
			System.out.println("나 : 보, 컴 : 가위, 졌습니다.");		
		}else if( com == 1 && userInt == 0) {
			System.out.println("나 : 가위, 컴 : 바위, 졌습니다.");	
			
		}else if ( com == 1 && userInt == 2) {
			System.out.println("나 : 보, 컴 : 바위, 졌습니다.");	
		}else if ( com == 2 && userInt  == 0) {
			System.out.println("나 : 가위, 컴 : 보, 이겼습니다.");	
		}else if ( com == 2 && userInt == 1) {
			System.out.println("나 : 바위, 컴 : 보, 졌습니다.");	
		}else {
			System.out.println("비겼습니다.");	
		}
		
		
	}
}
