package sec;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변수 x의 값을 입력 하세요. ");
		String strX = sc.nextLine();
		
		System.out.println("변수 y의 값을 이력하세요. ");
		String strY = sc.nextLine();
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		int result = x + y;
		System.out.println("x + y =" + result);
		System.out.println("+++++++++++++++Ten End+++++++++++");
		
		
	}

}
