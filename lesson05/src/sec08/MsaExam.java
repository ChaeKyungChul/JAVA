package sec08;

public class MsaExam {

	public static void main(String[] args) {
		
//		if(args.length != 2) {
//			System.out.println("매개변수의 수가 부족하거나 많습니다");
//			System.exit(0); //프로그램 강제종
//		}
//		String snum1 = args[0];
//		String snum2 = args[1];
//		
//		int num1 = Integer.parseInt(snum1);          // int 를 integer로 타입변환
//		int num2 = Integer.parseInt(snum2);
//		int result = num1 + num2;
//		System.out.println(num1 + " + " + num2 + "=" + result);  ////////////  cmd 로 확인가능  , run configurations 에서가능
//		
//
//	}

		// 네게의 수를 받아서 합을 구하고 평균을 구하라

	if(args.length != 4) {
		System.out.println("매개변수가 부족");
		System.exit(0);
	}
	String snum1 = args[0];
	String snum2 = args[1];
	String snum3 = args[2];
	String snum4 = args[3];
	
	int num1 = Integer.parseInt(snum1);
	int num2 = Integer.parseInt(snum2);
	int num3 = Integer.parseInt(snum3);
	int num4 = Integer.parseInt(snum4);
	int sum1 = num1 + num2 + num3 + num4 ;
	
	
	System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + sum1 );
	
	System.out.println("---------------------------------------------------------");
	double avg = (double) sum1/4;
	System.out.println( avg );
	
	
   }
	

}
