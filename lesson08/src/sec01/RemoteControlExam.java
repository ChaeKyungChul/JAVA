package sec01;

public class RemoteControlExam {
	public static void main(String[] args) {
		    System.out.println("최대 볼륨은 : " + Remotcontral.MAX_VOLUME + "입니다.");
		    System.out.println("최소 볼륨은 : " + Remotcontral.MIN_VOLUME + "입니다.");
			Remotcontral cc;
			cc = new Television();
			cc.turrOn();
			
			cc = new Audio();
			cc.turrOn();
		}

	}


