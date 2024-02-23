package egjam01;

public class IntExam {

	public static void main(String[] args) {
		//Byte 타입
		byte num1 = -128;
		byte num2 = -30;
		byte num3 = 0;
		byte num4 = 30;
		byte num5 = 127;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		//char 타입
		char c1 = 'A';  //문자를 직접 저장
		char c2 = 65;  // 십진수로 저장
		char c3='\u0041'; //유니코드, 16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 ='\uac00' ;
		
		int uniCode = c4;   //유니코드검색
				
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);     //유니코드
	}

}
