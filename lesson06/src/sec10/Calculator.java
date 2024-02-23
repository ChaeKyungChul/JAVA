package sec10;

public class Calculator {

	//정적필드
	static double pi = 3.14159;
	
	//정적 메소드                  
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {     //ㅡㅡ>int result2 =  Calculator.plus( 10 , 5); 바로 가능
		return x - y;
	}
	
	//인스턴스 메소드         
	//Calculator result4 = new Calculator();
	//int rs3 = result4.multiplay(5, 15);
	//System.out.println("5*15 = " + rs3);
	
	int multiplay(int x, int y) {
		return x*y;
	}
}
