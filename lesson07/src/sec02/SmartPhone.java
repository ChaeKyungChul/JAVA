package sec02;

public class SmartPhone extends Phone{ //Phone 상속받음

	//필드
		public boolean wifi;
	//생성자
		public SmartPhone(String model, String color) {
			super(model, color); //부모 생성자 호출
			System.out.println("SmartPhone(String model, String color) 생성자가 실행");

		}	
	//메소드
		public void setwifi(boolean wifi) {
			this.wifi = wifi;
			System.out.println("와이파이의 상태를 변경했습니다.");
		}
		
		public void internet() {
			System.out.println("인테넛에 연결 합니다.");
		}
	
}


