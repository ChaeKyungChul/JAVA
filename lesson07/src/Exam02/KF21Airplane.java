package Exam02;

public class KF21Airplane extends Airplane {
	//상수 선언 상수는 static final로 선언
	public static final int normal = 1;
	public static final int supersonic = 2;
	
	//상태선언 필드
	public int flyMode = normal;

	@Override
	public void fly() {
		if(flyMode == supersonic) {
			System.out.println("초음속 비행을 합니다.");
		}else {
			//부모 클래스 Airplane의 method fly() 호출해서 사용
			super.fly();
		}
		
	
	}
	
}
