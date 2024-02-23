package sec04;

import java.util.Scanner;

public class Exe07Exam {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int bmoney = 0;
		boolean run =true;
		
		while(run) {
			System.out.println("**********************************************");
			System.out.println("원하는 메뉴의 번호를 선택하세요.");
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("**********************************************");
			System.out.println("선택 > ");
			
			String sce = sc.nextLine();
			
			int num = Integer.parseInt(sce) ;//string 타입을 integer타입으로 변환 ★★★마니나옴★★★
			
			switch(num){
			case 1:
				System.out.println("예금액 > ");
				bmoney += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액 > ");
				int newMoney = bmoney;
				newMoney -= Integer.parseInt(sc.nextLine());
				if(newMoney < 0) {
					System.out.println("잔금이 없습니다.");
				}else {
					bmoney = newMoney;
				}
				break;
			case 3:
				System.out.println("잔고 > ");
				System.out.println(bmoney);
				break;
			case 4: 
				run=false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
