package sec08;

public interface Service {
    //default 
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();         //디폴트해줘야 사용가능
		staticCommon();
	}
	
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defalutMethod 중복 코드A");  //디폴트해줘야사용가능
		System.out.println("defalutMethod 중복 코드B");
	}
	
	
	//정적 메소드 
	static void staticMethod1() {
		System.out.println("staticMethod12 종속코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod12 종속코드");
		staticCommon();
	}
	//private 정적 메소드 
	private static void staticCommon() {
		System.out.println("scaticMethod 중복코드 C");
		System.out.println("scaticMethod 중복코드 D");
	}
}
