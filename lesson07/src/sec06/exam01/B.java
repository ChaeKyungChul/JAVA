package sec06.exam01;

/* Class B에서 메소드를 선언한 후 A클래스를 a로 객체화 하여 필드와 메소드를
 * 호출시켜보자 */
public class B {
	/**
	 * 접근제한자 protected는 같은 패키지 내에서는 public , default와 같이 자유롭게 사용이 가능하다.
	 */
	
	//메소드 선언

	public void method( ) {
		A a = new A(); // ---- 같은 패키지 안에서 protected는 사용 가능
		a.field = "value";
		a.method();
	}
}
