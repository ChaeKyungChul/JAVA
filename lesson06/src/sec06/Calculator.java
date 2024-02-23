package sec06;

public class Calculator {
	//필드
	// 생성자 기본
	//메소드
	//리턴이 없는 메소드 선언
	void powerOn(){
		System.out.println("전원을켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y){
		double result = (double) x / y; 
		return result;
	}
}
