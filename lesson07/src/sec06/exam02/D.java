package sec06.exam02;

import sec06.exam01.A;

public class D extends A{
	//생성자 선언
	public D() {
		//A 생성자 호출
		super();
	}
	
	//메소드 선언
	public void method1() {
		//A 필드 변경
		this.field = "value";
		
		//A 메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {
		/**
		 * 상속을 받았어도 procted 접근제한자가 있는 클래스를 직접 객체로 만들어 사용 할 수는 없다.
		 */
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
