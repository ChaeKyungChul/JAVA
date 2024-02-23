package exam132.package2;

import exam132.package1.*;

public class C {
     //메소드 만들어 불러옴
	public void methodB() {
		//A 클래스의 객체를 만듬
		A a = new A();
		
		//a의 필드를 변경
		a.field1 = 11;  // public 필드는 이클래스에서 변경가능
	//	a.field2 = 21; // default  다른패키지라 불가능
	//	a.field3 = 31;  // privite 필드는 외부 클래스에서 변경이 불가능 
		
		//메소드 호출 
		a.method1();
		//a.method2();  <다른패키지라 불가능
		//a.method3(); // privite 필드는 외부 클래스에서 변경이 불가능 
	}
	 
	
}
