package sec08;

public class ArrayStringExam {

	public static void main(String[] args) {
		
			String[] strArr = new String[3]; //자바에선 갯수선언해줘야댐
			
			strArr[0] = "Java";
			strArr[1] = "Java";
			strArr[2] = new String("Java");
	
			System.out.println("0번 :"+ strArr[0] );
			System.out.println("0번 :"+ strArr[1] );
			System.out.println("0번 :"+ strArr[2] );   //새로운곳에저장
			
			System.out.println(strArr[0]==strArr[1]);         //true   같은 객체의 주소를 참조
			System.out.println(strArr[0]==strArr[2]);         // false  2번객체는 다른 주소에 생성됨
			
			System.out.println(strArr[0].equals(strArr[2]));   //타입확인 equals로,// 문자열의 같음, 다름은 equals()메소드 이용
	}
}
