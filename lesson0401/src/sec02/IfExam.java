package sec02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = sc.nextInt();
		if(num > 90 ) {
				System.out.println("A�����Դϴ�.");
		}else if(num > 80) {
				System.out.println("B�����Դϴ�.");
		}else if (num > 70) {
				System.out.println("C�����Դϴ�.");
		}else if (num > 60) {
				System.out.println("D�����Դϴ�.");
		}else{
				System.out.println("F�����Դϴ�.");
		
	  }
	}

}	
