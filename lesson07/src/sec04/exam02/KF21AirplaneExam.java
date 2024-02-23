package sec04.exam02;

public class KF21AirplaneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실행 클래스를 만들고 
		//이륙합니다.
		//일반 비행합니다.
		//초음속 비행합니다.
		//일반 비행합니다.
		//착륙합니다.

		KF21Airplane kf = new KF21Airplane();
			kf.takeOff();
			kf.fly();
			kf.flyMode = KF21Airplane.SUPERSONIC;
			kf.fly();
			kf.flyMode = KF21Airplane.NORMAL;
			kf.fly();
			kf.land();
			
			
		
	}

}

