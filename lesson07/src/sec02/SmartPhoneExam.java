package sec02;

public class SmartPhoneExam {

	public static void main(String[] args) {
			
		//��ü�� ����
		SmartPhone myPhone = new SmartPhone("������", "��ũ���");
		
		//Phone ���κ��� ��ӹ��� �ʵ带 �б�
		System.out.println("�� : " + myPhone.model);
		System.out.println("���� : " + myPhone.color);
		
		//SmartPhone �ʵ�
		System.out.println("�������� ���� : " + myPhone.wifi);
		
		//Phone ���� ���� ��ӹ��� �޼ҵ� ȣ��
		myPhone.bell();
		myPhone.sendVoice("��������");
		myPhone.receiveVoice("�ȳ��ϼ���? ���� ���� ��ǰ���־� ��ȭ��Ⱦ��.");
		myPhone.sendVoice("���� ���� �ٺ���. �����.");
		myPhone.hangUp("����");
		
		//SmartPhone �޼ҵ� ȣ��
		myPhone.setWifi(true);
		myPhone.internet();
		
		
		
 
	}

}
