package sec;

public class AccExam {

	public static void main(String[] args) {
		/*
		 * ����� 1�ִ�. �̻���� 10�������� ������.
		 * �������� 0.1
		 * 7������ �԰� ���� ������ ���ΰ�?
		 * 0.3
		 * */
		int apple =1;
		double onePeace = 0.1;
		int number = 7;
		
		double resultApple = apple - number*onePeace;
		System.out.println("��� �Ѱ����� ���� ����" + resultApple + "�Դϴ�.");   // 0.2999999999999
		
		
		int totalpeace = apple * 10;
		int resultApple2 = totalpeace - number;
		System.out.println("��� 10���� �߿� ���� ������ " + resultApple2);
		System.out.println("��� �Ѱ����� �������� "  + resultApple2/10.0);
		
		

	}

}