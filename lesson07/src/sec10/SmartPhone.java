package sec10;

public class SmartPhone extends Phone{
	//생성자
	SmartPhone(String owner){
		super(owner);
	}
	
	//메소드
	void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}
}
