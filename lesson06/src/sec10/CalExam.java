package sec10;

public class CalExam {

	public static void main(String[] args) {
		//��������� Ŭ������ �Ҽӵ� �����
		//�ν��Ͻ� ����� 
		
		double result = 10 * 10 * Calculator.pi;
		System.out.println("�������� 10 �� ���� �������� " + result +"�Դϴ�.");
		
		
		//10 +5 ��� plus �޼ҵ� minus ���
		int result2 =  Calculator.plus( 10 , 5);
		System.out.println("10+5 =" +result2);
		int result3 = Calculator.minus(10, 5);
		System.out.println("10-5 = " + result3);
		
		//10*5 ������غ��� multiply
		
		Calculator result4 = new Calculator();
		int rs3 = result4.multiplay(5, 15);
		System.out.println("5*15 = " + rs3);
	}

}
