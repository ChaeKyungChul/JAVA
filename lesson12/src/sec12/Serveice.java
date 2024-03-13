package sec12;

public class Serveice {
	@PrintAno
	public void method01() {
		System.out.println("어노테이션이 있는 실행문");
		
	}
	@PrintAno("*")
	public void method2(){
		System.out.println("어노테이션 모양이 바뀐 실행문");
	}
	
	@PrintAno(value="#", number=30)
	public void method3() {
		System.out.println("어노테이션 모양과 숫자를 바꾼 실행문");
	}
	
}
