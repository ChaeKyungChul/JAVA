package exam14;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-10);
		System.out.println("현재속도 :" + myCar.getSpeed());
		
		myCar.setSpeed(100);
		System.out.println("현재속도 :" + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도는 :" + myCar.getSpeed());
	}

}
