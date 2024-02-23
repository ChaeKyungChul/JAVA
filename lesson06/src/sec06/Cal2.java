package sec06;

public class Cal2 {
	//필드 -- 생략
	//샹성자 -- 기본생성자
	// 메소드 
	//리턴없는 메소드 선언
	void powerOn(){
		System.out.println("전원을 켭니다.");    //리턴없는것 void 추가
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");  //리턴없는것 void 추가
	}

	//두 매개변수를 더하는 메소드
	int plus(int x, int y) {
	  int result = x + y;
		return result ;
	}
	
	//두정수를 나누는 메소드
	double divide(int x , int y){
	  double result = (double)  x / y;
			   return result;
	
	  
	  
	}
}
