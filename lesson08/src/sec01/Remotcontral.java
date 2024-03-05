package sec01;

public interface Remotcontral {
	//인터페이스에서 필드는 public 상수값만 갖을수 있다.
	//인터페이스 내에서 필드에 값을 선언하면 그것이 곧 상수이다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
    //인터페이스 내에서 정의되는 메소드는 모두 추상 메소드이다.
	void turrOn();
	void turnOff();
	void setVolume(int volume);
	
	
	//디폴드 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
			
			//
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
