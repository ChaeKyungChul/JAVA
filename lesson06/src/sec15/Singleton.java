package sec15;

public class Singleton {
	
	private static Singleton singleton;
	// private 접근 권한을 갖는 정적 필드 선언으로 초기화
	Singleton singlton = new Singleton();
	
	// 생성자는 private 로 외부 접근을 막음
	 private Singleton() {}
	 
	 // public 권한을 갖는 메소드를 만들어 필드를 사용
	 public static Singleton getInstance() {
		 return singleton;
	 }
}
