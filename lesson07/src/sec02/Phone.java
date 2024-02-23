package sec02;

public class Phone {
	//필드
	
	public String model;
	public String color;
	
	public Phone() {
		
		System.out.println("부모 생성자 실행");
	}
	
	//생성자 - 기본생성자  phone (){}
	//메소드 
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	public void receiveVoice(String message) { 
		System.out.println("상대방 : " + message);
	}
	public void hangUp(String message) {
		System.out.println("전화를끊습니다." + message);
	}

}
