package sec10;

public class Television {
	
	//정적 멤버안에서 인스턴스 멤버는 사용할 수 없다.
	
	int pay = 2000000;
	String color;
	
	static String company = "LG"; // 정적필드는 일반적으로 바로 초기화를 한다.
	static String model = "OLED";
	static String info;  // 정적 블록을 선언하는방법 
	static {
		info = company + "-" + model; 
	}
	void method(int getPay) {  //인스턴스 메소드
		this.pay = getPay;
	    this.color = "빨강";
	    System.out.println(this.pay+", " + this.color + info);
	}
	
	static void method2() {   //정적메소드
		System.out.println(info);
	}
}
