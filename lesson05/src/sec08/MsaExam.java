package sec08;

public class MsaExam {

	public static void main(String[] args) {
		
//		if(args.length != 2) {
//			System.out.println("�Ű������� ���� �����ϰų� �����ϴ�");
//			System.exit(0); //���α׷� ������
//		}
//		String snum1 = args[0];
//		String snum2 = args[1];
//		
//		int num1 = Integer.parseInt(snum1);          // int �� integer�� Ÿ�Ժ�ȯ
//		int num2 = Integer.parseInt(snum2);
//		int result = num1 + num2;
//		System.out.println(num1 + " + " + num2 + "=" + result);  ////////////  cmd �� Ȯ�ΰ���  , run configurations ��������
//		
//
//	}

		// �װ��� ���� �޾Ƽ� ���� ���ϰ� ����� ���϶�

	if(args.length != 4) {
		System.out.println("�Ű������� ����");
		System.exit(0);
	}
	String snum1 = args[0];
	String snum2 = args[1];
	String snum3 = args[2];
	String snum4 = args[3];
	
	int num1 = Integer.parseInt(snum1);
	int num2 = Integer.parseInt(snum2);
	int num3 = Integer.parseInt(snum3);
	int num4 = Integer.parseInt(snum4);
	int sum1 = num1 + num2 + num3 + num4 ;
	
	
	System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + sum1 );
	
	System.out.println("---------------------------------------------------------");
	double avg = (double) sum1/4;
	System.out.println( avg );
	
	
   }
	

}
