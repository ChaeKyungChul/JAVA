package sec10;

public class CalExam {

	public static void main(String[] args) {
		//정적멤버는 클래스에 소속된 멤버다
		//인스턴스 멤버는 
		
		double result = 10 * 10 * Calculator.pi;
		System.out.println("반지름이 10 인 원의 원주율은 " + result +"입니다.");
		
		
		//10 +5 출력 plus 메소드 minus 출력
		int result2 =  Calculator.plus( 10 , 5);
		System.out.println("10+5 =" +result2);
		int result3 = Calculator.minus(10, 5);
		System.out.println("10-5 = " + result3);
		
		//10*5 도출력해보자 multiply
		
		Calculator result4 = new Calculator();
		int rs3 = result4.multiplay(5, 15);
		System.out.println("5*15 = " + rs3);
	}

}
