package EX01;

public class EX01 {

	public static void main(String[] args) {
		  
	   /* 5.두 숫자 74와 36의 합을 출력하라.*/

		int a = 36;
		int b = 74;
		System.out.println(a+b);
		
			
		/*
    6. 숫자50을 3으로 나누어 결과를 화면에 출력하라. 단 결과는 정수이다.*/
		
		int c = 50;
		int d =  c/3;
		System.out.println(d);
		
	/*
    7. 다음 결과를 출력하라.
    
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
		
		
		/* 8. 99단을 1부터 9까지 출력하라.    */
		
		int x = 99;
		int y = 1;
		while (y < 9) {
			y++;	
			System.out.println(x + "x" + y + "=" + (x*y));
		
		}
	}

}
