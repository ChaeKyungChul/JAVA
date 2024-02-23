package sec02;

public class SwitchChar01Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'b';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수한 회원입니다.");
			break;
		case 'B':
		case 'b': 
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}
}

/*
 * java v12 부터는 아래와 같이 구성할수있다.
 * switch(grade){
 * case 'A', 'a' ,? {
 * }
 * case 'B', 'b'{ 
 * }
 * */
 