package sec02;

public class Phone {
	//필드
	 public String model;
	 public String color;
	 
	 public Phone(String model, String color) {
		 this.model = model;
		 this.color = color;
		 System.out.println("Phone(String model, String color) 부모 생성자 실행");
	 }
	 
	//생성자 - 만들지 않으면 기본생성자 Phone(){} 위에 필드에 만들어 준거를 {}안에 사용
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
	 public void hangUp() {
		 System.out.println("전화를 끊습니다.");
	 }
}
