package Ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		boolean r = true;
		int studentNumber = 0;
		int[] scores = null;
		
		while(r) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			
		  int selectNo = Integer.parseInt(sc.nextLine());
		  
		  switch(selectNo) {
		  	  case 1:
		  		  System.out.println("학생수>");
		  		  studentNumber = Integer.parseInt(sc.nextLine());
		  		  scores = new int[studentNumber]; // 학생수만큼의 점수 배열을 만들어 놓는다. 
			  break;
		  	  case 2:
			
			    for(int i=0; i<scores.length; i++) {
			    	scores[i] = Integer.parseInt(sc.nextLine());
			    }
			   
			  break;
		  	  case 3:	    for(int i=0; i<scores.length; i++) {
		  		  System.out.println("scores[i]+");
		  	  }	    
		 		    
		     	 System.out.println("입력된 점수 :" + Arrays.toString(scores));
		  	  break;
		  	  case 4:
		  		  int max = 0;
		  		  int sum = 0;
		  		  double avg = 0.0;
		  		  
		  		  for(int i = 0 ; i<scores.length; i++) {
		  			  max = (max < scores[i]) ? scores[i] : max;
		  			  sum += scores[i];
		  		  }
		  		
				avg = (double) sum / studentNumber;
		  		  System.out.println("최고 점수 : " + max + "점");
		  		  System.out.println("평균 점수 : " + avg + "점");
		  	  break;
		  	  case 5:
		  		  r = false;
		  	  break;
		  	  default :
		  		  r = false;
		  
		  }
			
		}
		
		
		System.out.println("*****************************");
		System.out.println("프로그램 종료되었습니다");
		System.out.println("*****************************");
	}

}
