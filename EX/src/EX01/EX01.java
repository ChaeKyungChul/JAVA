package EX01;

public class EX01 {

	public static void main(String[] args) {
		  
	   /* 5.�� ���� 74�� 36�� ���� ����϶�.*/

		int a = 36;
		int b = 74;
		System.out.println(a+b);
		
			
		/*
    6. ����50�� 3���� ������ ����� ȭ�鿡 ����϶�. �� ����� �����̴�.*/
		
		int c = 50;
		int d =  c/3;
		System.out.println(d);
		
	/*
    7. ���� ����� ����϶�.
    
      1) -5 + 8 * 6
    
      2) (55 + 9) % 9
    
      3) 20 + 3*5/8
    
      4) 5+15/3*2-8%3/	*/
		
		
		System.out.println(-5+8*6);
		System.out.println((55+9)%9); 
		double e = (double) 3*5/8+20;
		System.out.println(e);
		double f = (double) 5+15/3*2-8%3; 
		System.out.println(f);
		
		
		/* 8. 99���� 1���� 9���� ����϶�.    */
		
		int x = 99;
		int y = 1;
		while (y < 9) {
			y++;	
			System.out.println(x + "x" + y + "=" + (x*y));
		
		}
	}

}
