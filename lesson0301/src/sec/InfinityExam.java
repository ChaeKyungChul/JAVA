package sec;

import java.util.Scanner;

public class InfinityExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x���� ���ڸ� �Է��ϼ���");
		//String strX = sc.netLine();
		// int x = Integer.parseInt(strX);
		int x = sc.nextInt();
		
		System.out.println("y���� ���ڸ� �Է��ϼ���.");
		double y =sc.nextDouble();
		
		double z = x / y;
		
		//int x = 5;
		//double y = 0;   // int ����  double�� infinity
		//double z= x / y;
		//System.out.println(z);
		//System.out.println(z+ 10000);
		
		
		  // ����ó�� �Ǽ�Ÿ�Ը� ���� ����Ÿ�����׳� ����
		if(Double.isInfinite(z)|| Double.isNaN(z)) {
			System.out.println("���� �Ի� �Ҽ� ����.");
		}else {
			System.out.println(z + 2);
		}
		sc.close();
	}
}
