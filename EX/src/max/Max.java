package max;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {

		
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("3���� �����Է��ϼ���");
     
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    
    int max = findMax(a, b, c);
     System.out.println("����ū���� :"+ max);
     
     scanner.close();
	}

	private static int findMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
		   max = b;	
		}
		if (c > max) {
			max = c;
		}
		
		return max;
	}

	 
}
