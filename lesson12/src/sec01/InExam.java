package sec01;

import java.io.IOException;

public class InExam {

	public static void main(String[] args) {

		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			//Enter Ű�� ���� �ʾ��� ��� ����
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					System.out.println("��");
					speed++;
			}else if(keyCode == 50) {
				System.out.println("��");
				speed--;
			}else if(keyCode == 51) {
				System.out.println('��');
				break;			
		    	}
				
				System.out.println("-------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("--------------------------");
				System.out.println("����ӵ� :" + speed);
				System.out.println("���� : ");
			}
			//Ű�� �ϳ��� ������Ѵ�.
			try {
			keyCode = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		System.out.println("���α׷�����");

	}

}
