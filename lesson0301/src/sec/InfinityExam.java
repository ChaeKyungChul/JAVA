package sec;

import java.util.Scanner;

public class InfinityExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x값의 숫자를 입력하세요");
		//String strX = sc.netLine();
		// int x = Integer.parseInt(strX);
		int x = sc.nextInt();
		
		System.out.println("y값의 숫자를 입력하세요.");
		double y =sc.nextDouble();
		
		double z = x / y;
		
		//int x = 5;
		//double y = 0;   // int 오류  double는 infinity
		//double z= x / y;
		//System.out.println(z);
		//System.out.println(z+ 10000);
		
		
		  // 예외처리 실수타입만 가능 문자타입은그냥 에러
		if(Double.isInfinite(z)|| Double.isNaN(z)) {
			System.out.println("값을 게산 할수 없음.");
		}else {
			System.out.println(z + 2);
		}
		sc.close();
	}
}
