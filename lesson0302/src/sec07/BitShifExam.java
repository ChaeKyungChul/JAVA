package sec07;

public class BitShifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num1 = 1;
			int rs1 = num1 << 3 ;
			int rs2 = num1 * (int) Math.pow(2, 3);
			System.out.println(rs1);
			System.out.println(rs2);
			
			int num2 = -8;
			int rs3 = num2 >> 3;
			int rs4 =  (int) (num2 / Math.pow(2, 3));	
			System.out.println(rs3);
			System.out.println(rs4);
			
			
			
			
			int val = 772;                 //2���� ��ȯ��
			String strVal = Integer.toBinaryString(val); //2���� ��ȯ��
			while(strVal.length() < 32)//2���� ��ȯ��
			{
				strVal = "0" + strVal;//2���� ��ȯ��
			}
			System.out.println(strVal);//2���� ��ȯ��
			
			byte byte1 = (byte) (val >>> 24);    //  00000000 00000000 00000011 00000100 
												//   00000000==>0          �������� 3byte �̵� ������ 1����Ʈ������  (24��Ʈ�̵�)
			
			byte byte2 = (byte) (val >>> 16);   // 00000000 00000000 00000011 00000100 
												//  00000000 00000000 == > 0        �������� 2byte �̵� ������ 1����Ʈ������
			
			byte byte3 = (byte) (val >>> 8);   // 00000000 00000000 00000011 00000100
	          									//00000000 00000000 00000011 -> 3   �������� 1����Ʈ �̵� ������ 1����Ʈ������
			 								
			
			byte byte4 = (byte) val;         ///  00000000 00000000 00000011 00000100  
										     //   00000100 -> 4    ������ 1����Ʈ�� �о��.
			   
			
		 	
		 	System.out.println(byte1);
		 	System.out.println(byte2);
		 	System.out.println(byte3);
		 	System.out.println(byte4);
			
			
	} 
	 	
}
