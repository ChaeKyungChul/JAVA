package sec10;

public class ClassName {
//인스
	int field1;
	void method() {}
	//정적
	static int field2;
	static void mothod2() {}
	
	//정적블록
	static {
		//field1 = 10; 컴파일에러
		//method1();  컴파일에러
		field2 = 10;
		mothod2(); 
 	}
	//정적메소드
	static void metho3() {
		//this.field1 = 10; //this 사용할수없다.
		//this.method1() ; //
		field2 = 10;
		mothod2();
	}
	
}

