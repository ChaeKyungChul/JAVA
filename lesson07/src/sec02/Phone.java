package sec02;

public class Phone {
	//�ʵ�
	
	public String model;
	public String color;
	
	public Phone() {
		
		System.out.println("�θ� ������ ����");
	}
	
	//������ - �⺻������  phone (){}
	//�޼ҵ� 
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	public void sendVoice(String message) {
		System.out.println("�� : " + message);
	}
	public void receiveVoice(String message) { 
		System.out.println("���� : " + message);
	}
	public void hangUp(String message) {
		System.out.println("��ȭ�������ϴ�." + message);
	}

}
