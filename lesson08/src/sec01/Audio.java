package sec01;

public class Audio implements Remotcontral {

	//�ʵ�
	private int volume;
	private int defaultvolume;
	
	
	@Override
	public void turrOn() {
		System.out.println("Audio�� �մϴ�");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume > Remotcontral.MAX_VOLUME) {
			this.volume = Remotcontral.MIN_VOLUME;
		}else if(volume < Remotcontral.MIN_VOLUME) {
			this.volume = Remotcontral.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ������� ���� ; " + volume );
	}
	//����Ʈ�޼����� ������ �ÿ��� �ݵ�� public ���� �ؾ� �ϸ� default �� �����Ѵ�.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.defaultvolume = this.volume;
			System.out.println("���� ó���մϴ�.");
			setVolume(Remotcontral.MIN_VOLUME);
		}else {
			System.out.println("���� �����մϴ�.");
			setVolume(this.defaultvolume);//muse ������ ��� ������ �������� ���ư�.
		}
	}
}
