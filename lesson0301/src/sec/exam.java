package sec;

public class exam {

	public static void main(String[] args) {

		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		//1. v1+ v2을출력하라
		//2. v1+ v2 -v4을출력하라
		//3. v1v2 
		//4. v1 % v2
    
		int result1= v1 + v2;
		System.out.println("v1 + v2 = " + result1 );
		
		long result2 = v1 + v2 - v4;
		System.out.println("v1 + v2 - v4 = " + result2);
		
		double result3= (double)v1 / v2;   //분수타입은 더블로 .
		System.out.println("v1 / v2 = " + result3);
		
		int result4 = v1 % v2 ;
		System.out.println("v1 % v2 = " + result4 );
	
				
		
		
	}

}
