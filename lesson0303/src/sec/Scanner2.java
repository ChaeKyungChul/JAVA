package sec;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scanner = new Scanner(System.in);
		      int data = 0;
		      while(true) {
		         System.out.println("숫자를 입력하세요 ");
		         String sc = scanner.nextLine();
		         int x = Integer.parseInt(sc);
		         data += x;
		         
		         if(x == 0) {
		            break;
		         }
		         System.out.println("합은 " + data);      
		         
		      }
		      System.out.println("---------- 끝  ----------");
	}

}
