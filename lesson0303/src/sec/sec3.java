package sec;

public class sec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڿ���
		int res1 = 10 + 2 + 8;    //��Ƽ��Ÿ��
		System.out.println(res1);
		
		//���� ����    string ���ڿ�
		  String res2 = 10 + 2 +"8";  // ���ڿ� 12 8
		  System.out.println(res2);  
		  
		  int resInt = Integer.parseInt(res2);
		  int resRes =res1 + resInt;
		  System.out.println(resRes);
		   
		  String res3 = 10 + "2" +8;   // ���ڿ� 10 2 8
		  System.out.println(res3); 
		  
		  String res4 = "10" + 2 + 8;  // ���ڿ� 1028
		  System.out.println(res4);
		  
		  String res5 = "10" + (2+ 8); // ���ڿ�+10
		  System.out.println(res5);
		  
		  
		  System.out.println("�����ڰ� �Ǳ� ���� �ʼ� ���� ��� java");
	}

}
