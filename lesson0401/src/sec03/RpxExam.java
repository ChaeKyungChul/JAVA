package sec03;

import java.util.Scanner;

public class RpxExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  Scanner sc = new Scanner(System.in);
	      boolean game = true;
	      
	      do {
	          int computerChoice = (int)(Math.random()*3);
	           System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
	           String userChoice = sc.nextLine();
	           
	           //입력값 검증(가위, 바위, 보 이외의 숫자를 쓰면 에러를 출력한다.
	           if(!userChoice.equals("가위")&&!userChoice.equals("바위")&&!userChoice.equals("보")) {
	              System.out.println("잘 못 입력했습니다. 다시 입력하세요.");
	              continue;
	           }
	           
	           switch(computerChoice) {
	               case 0:  //컴퓨터 가위
	                if(userChoice.equals("바위")) {
	                   System.out.println("이겼습니다.");
	                   game = false;
	                }else if(userChoice.equals("보")) {
	                   System.out.println("졌습니다.");
	                   game = false;
	                }else {
	                   System.out.println("비겼습니다.");
	                }
	              break;
	               case 1://컴퓨터 바위
	                if(userChoice.equals("가위")) {
	                   System.out.println("졌습니다.");
	                   game = false;                   
	                }else if(userChoice.equals("바위")) {
	                   System.out.println("비겼습니다.");  
	                }else {
	                   System.out.println("이겼습니다.");
	                   game = false;        
	                }   
	               break;
	               case 2:  //컴퓨터 보
	                if(userChoice.equals("가위")) {
	                   System.out.println("이겼습니다.");
	                   game = false;                         
	                }else if(userChoice.equals("바위")) {
	                   System.out.println("졌습니다.");
	                   game = false;        
	                }else {
	                   System.out.println("비겼습니다.");  
	                }
	               break;
	           }
	         
	      }while(game);

	      System.out.println("게임을 종료 합니다.");
	      sc.close();
	   }

	}
