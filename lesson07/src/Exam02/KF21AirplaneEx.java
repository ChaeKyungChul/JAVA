package Exam02;

public class KF21AirplaneEx {

	public static void main(String[] args) {

		KF21Airplane kf = new KF21Airplane();
		kf.takeOff();
		kf.fly();
		kf.flyMode = KF21Airplane.supersonic;
		kf.fly();
		kf.flyMode = KF21Airplane.normal;
		kf.fly();
		kf.land();
	}

}
