package sec01;

public interface Remotcontral {
	//�������̽����� �ʵ�� public ������� ������ �ִ�.
	//�������̽� ������ �ʵ忡 ���� �����ϸ� �װ��� �� ����̴�.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
    //�������̽� ������ ���ǵǴ� �޼ҵ�� ��� �߻� �޼ҵ��̴�.
	void turrOn();
	void turnOff();
	void setVolume(int volume);
	
	
	//������ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
			setVolume(MIN_VOLUME);
			
			//
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�.");
	}
}
