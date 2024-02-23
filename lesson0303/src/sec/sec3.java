package sec;

public class sec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숫자연산
		int res1 = 10 + 2 + 8;    //인티저타입
		System.out.println(res1);
		
		//결합 연산    string 문자열
		  String res2 = 10 + 2 +"8";  // 문자열 12 8
		  System.out.println(res2);  
		  
		  int resInt = Integer.parseInt(res2);
		  int resRes =res1 + resInt;
		  System.out.println(resRes);
		   
		  String res3 = 10 + "2" +8;   // 문자열 10 2 8
		  System.out.println(res3); 
		  
		  String res4 = "10" + 2 + 8;  // 문자열 1028
		  System.out.println(res4);
		  
		  String res5 = "10" + (2+ 8); // 문자열+10
		  System.out.println(res5);
		  
		  
		  System.out.println("개발자가 되기 위한 필수 개발 언어 java");
	}

}
