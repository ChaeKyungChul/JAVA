package sec;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 =15;
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
	//	int v3 = v1 + v2 + 5;  //v2는 변수를 사용할 수 없기 때문에 컴파일불가  (v2가 위if안에있음
		
		System.out.print("1번텍스트\r");    ///  \r줄바꿈
		System.out.print("2번텍스트\r");
		
		System.out.printf("이름 : %s", "홍길동");
		System.out.printf("나이 : %d\r", 25);
		
		System.out.printf("이름 : %s, 나이 : %d", "홍길 동", 25);
		
	}
	
	

}
