package sec10;

public class Car {
//	Car 클래스 만든후 
//	인스턴스 필드 speed
//	인스턴스 메소드 run()
//	인스턴스 메소드run() 
//	단 run() 메소드는 speed + "으로 달립니다." 라고 출력되는 메소드이다
//	 
//	정적메소드 simulate를만들어 simulate에서
//	speed 를 200으로 초기화 한후 run ()시켜라
//	
	
	
	// 인스턴스 필드 선언
	int speed;
	//인스턴스 메소드 선언
     void run () {
	  System.out.println(speed + "으로 달립니다.");
     }
    
     static void simulate() {
    	 //객체생성
    	 Car myCar = new Car();
    	 
    	 //인스턴스 멤버
    	 myCar.speed = 200;
    	 myCar.run();
     }
	public static void main(String[] args) {
		
		simulate();
		
		Car myCar = new Car();
		myCar.speed = 50;
		myCar.run();
		
	}

}
