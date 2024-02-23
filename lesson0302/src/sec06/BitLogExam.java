package sec06;

public class BitLogExam {

	public static void main(String[] args) {
		//비트연사에서는   or and 낫 한개만씀
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 =" + (45 | 25));
		System.out.println("45 ^ 25 =" + (45 ^ 25));
		System.out.println("~45 =" + (~45));          //다 반대로  첫번쨰 - + 합
		System.out.println("~10 =" + (~10));
		System.out.println("----------THE END---------");
		
		
		//byte receiv 
		//방법1 : 
		//int usnInt = 
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1)+ "(십진수"+v1+")" );
		System.out.println(toBinaryString(v2)+ "(십진수"+v2+")" );
		System.out.println(toBinaryString(v3)+ "(십진수"+v3+")" );
	
		
	}
	
	public static String toBinaryString(int num) {
		
		String str = Integer.toBinaryString(num);   // 정수를 2진 문자열로 변환해주는 메소드
		while(str.length() < 32) {
			str ="0" + str;
		}		
		return str;
	}
	
	
	
}
