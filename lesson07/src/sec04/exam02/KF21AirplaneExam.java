package sec04.exam02;

public class KF21AirplaneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� Ŭ������ ����� 
		//�̷��մϴ�.
		//�Ϲ� �����մϴ�.
		//������ �����մϴ�.
		//�Ϲ� �����մϴ�.
		//�����մϴ�.

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

