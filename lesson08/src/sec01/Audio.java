package sec01;

public class Audio implements Remotcontral {

	//필드
	private int volume;
	private int defaultvolume;
	
	
	@Override
	public void turrOn() {
		System.out.println("Audio를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
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
		System.out.println("현재 오디오의 볼륨 ; " + volume );
	}
	//디폴트메서드의 재정의 시에는 반드시 public 으로 해야 하며 default 는 생략한다.
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.defaultvolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(Remotcontral.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			setVolume(this.defaultvolume);//muse 해제될 경우 원래의 볼륨값을 돌아감.
		}
	}
}
