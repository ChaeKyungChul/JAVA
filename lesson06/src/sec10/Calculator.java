package sec10;

public class Calculator {

	//�����ʵ�
	static double pi = 3.14159;
	
	//���� �޼ҵ�                  
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {     //�Ѥ�>int result2 =  Calculator.plus( 10 , 5); �ٷ� ����
		return x - y;
	}
	
	//�ν��Ͻ� �޼ҵ�         
	//Calculator result4 = new Calculator();
	//int rs3 = result4.multiplay(5, 15);
	//System.out.println("5*15 = " + rs3);
	
	int multiplay(int x, int y) {
		return x*y;
	}
}
