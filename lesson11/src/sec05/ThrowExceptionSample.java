package sec05;

public class ThrowExceptionSample {
	
	
	
	public static void main(String[] args) {
		//실행 영역에서 대신 에러처리를 해주어야 함
	   try {
		   method1();
	   }catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	   // 에러 처리가 이루어졌기때문에 그냥 불러다 쓰면됨.
	   method2();
	}
	
	// 에러를 실행 영역으로 떠넘김
	public static void method1() throws ClassNotFoundException {  
		Class.forName("java.lang.String2");
	}

	
	//에러 처리를 직접함.
	public static void method2() {
		try {
			Class.forName("java.lang.Integer2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
