package sec10;

public class PhoneEx {

	public static void main(String[] args) {

//		Phone phone = new Phone(); 추상클래스이기 때문에 객체를 만들 수 없다.
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
