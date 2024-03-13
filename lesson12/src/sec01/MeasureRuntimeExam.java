package sec01;

public class MeasureRuntimeExam {

	public static void main(String[] args) {
		
		
		
		//long ti1 = System.currentTimeMillis();  //��
		long ti1 = System.nanoTime();
		int sum = 0;
		for(int i = 0; i <= 1000000000; i++) {
			sum += i;
		}
		//long ti2 = System.currentTimeMillis();
		long ti2 = System.nanoTime();
		
		System.out.println("1���� 1000000000������ ���� " + sum);
		System.out.println("��꿡 �ɸ� �ð��� " + (ti2 - ti1) + "������ �Դϴ�.");
		
		System.out.println(System.getProperties());  //���������
		System.out.println(System.getProperty("os.name")); //os���
		System.out.println(System.getProperty("user.name")); // ��������
		System.out.println(System.getProperty("user.home")); 
	}

}
