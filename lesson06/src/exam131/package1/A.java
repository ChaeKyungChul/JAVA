package exam131.package1;

public class A {
	//필드선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//public 접근제한자 선언 생성자 선언
	public A(boolean b) {};  //1번째 에러 사라짐
	
	//defalt 접근 제한으로 생성자 선언
     A(int b) {};    //2번째 에러사라짐
	
	//private 접근 제한으로 생성자 선언
	private A(String s) {}; //3번째 에러사라짐 , // 여러가지 오버로딩 
	

}
