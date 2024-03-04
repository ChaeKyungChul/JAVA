package sec02;

public class SmartPhoneEx {

	public static void main(String[] args) {
		
		//객체를 생성해서 사용
		SmartPhone myPhone = new SmartPhone("갤럭시", "핑크골드"); 
			
		//Phone으로 부터 상속받은 필드를 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		//SmartPhone 필드
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		//Phone으로 부터 상속 받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요? 좋은 대출 상품이 있어 전화드렷어요.");
		myPhone.sendVoice("제가 지금 바뻐요. 끊어요.");
		
		//SmartPhone 메소드 호출
		myPhone.setwifi(true);
		myPhone.internet();
	}

}
