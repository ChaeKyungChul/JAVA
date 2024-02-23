package sec04;

import java.util.Scanner;

public class charAtExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String hobby="";
		
		//if(hobby.equals("")) {
		//	System.out.println("취미를 좀 갖으시는게 건강에 좋아요.");
		//}
	

		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("주민번호를 뒤에한자리까지 -없이 입력하세요");
			String gender = sc.nextLine();
			
			if(gender.length() == 7) {
				//"9901191"
				
			char s =gender.charAt(6);
			switch(s) {
			case '1' : case '3' :
				System.out.println("당신은 남자 입니다.");
				break;
			case '2': case '4':
				System.out.println("당신은 여자 입니다.");
				break;
			}
					
				break;
		}
		
			System.out.println("==============끝=============");
			
			
		}
		
		//
		
	
		//int sc =  numbers.charAt(7);
		
		//if(num == 4 || num ==2 ) {
		//	System.out.println("여자");
		////}else if(num == 1 || num ==3) {
		//	System.out.println("남자");
			
		
		//}
		
	
	}

}
