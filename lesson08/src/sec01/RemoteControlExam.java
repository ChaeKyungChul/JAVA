package sec01;

public class RemoteControlExam {
	public static void main(String[] args) {
		    System.out.println("�ִ� ������ : " + Remotcontral.MAX_VOLUME + "�Դϴ�.");
		    System.out.println("�ּ� ������ : " + Remotcontral.MIN_VOLUME + "�Դϴ�.");
			Remotcontral cc;
			cc = new Television();
			cc.turrOn();
			
			cc = new Audio();
			cc.turrOn();
		}

	}


