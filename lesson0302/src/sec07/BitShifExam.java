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
			
			
			
			
			int val = 772;                 //2진수 변환법
			String strVal = Integer.toBinaryString(val); //2진수 변환법
			while(strVal.length() < 32)//2진수 변환법
			{
				strVal = "0" + strVal;//2진수 변환법
			}
			System.out.println(strVal);//2진수 변환법
			
			byte byte1 = (byte) (val >>> 24);    //  00000000 00000000 00000011 00000100 
												//   00000000==>0          우측으로 3byte 이동 마지막 1바이트만읽음  (24비트이동)
			
			byte byte2 = (byte) (val >>> 16);   // 00000000 00000000 00000011 00000100 
												//  00000000 00000000 == > 0        우측으로 2byte 이동 마지막 1바이트만읽음
			
			byte byte3 = (byte) (val >>> 8);   // 00000000 00000000 00000011 00000100
	          									//00000000 00000000 00000011 -> 3   우측으로 1바이트 이동 마지막 1바이트만읽음
			 								
			
			byte byte4 = (byte) val;         ///  00000000 00000000 00000011 00000100  
										     //   00000100 -> 4    마지막 1바이트를 읽어라.
			   
			
		 	
		 	System.out.println(byte1);
		 	System.out.println(byte2);
		 	System.out.println(byte3);
		 	System.out.println(byte4);
			
			
	} 
	 	
}
