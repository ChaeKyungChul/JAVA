package sec06;

public class Logicalexam {

	public static void main(String[] args) {
		
		//char char1 = 'A';    // char charCode : 'A'
		
		//if('A' >= 65) {
		//	System.out.println("char1 =" + "charCode는 대문자입니다.");
		//}

		
		//1.     문자 A를 변수 charCode에 담아 
		 // charCode가 65보다 크거나 같으면  "charCode는 대문자 입니다."를 출력하라.

		int charCode = 'A';
		if(( charCode >= 65) & (charCode <= 90)){
			System.out.println("대문자입니다.");
		}
		

	//	2. charCode가 97과 122사이에 있으면 charCode 는 소문자 입니다.  그렇지않으면
	//	소문자가 아닙니다를 출력하라. 
		if(( charCode >= 97) & (charCode <= 122)){
			System.out.println("소문자입니다.");
		}else {
			System.out.println("소문자가 아닙니다.");
		}
		
	//	3.  charCode가 48과 57사이에 있으면 charCode 는 숫자 입니다.  그렇지않으면
	//	숫자가 아닙니다.를 출력하라. 
		
		if(( charCode >= 48) & (charCode <= 57)){
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
	}
}
