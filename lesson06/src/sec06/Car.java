package sec06;

public class Car {
	 //오버로딩 ★★★★★★★★★★
	  // 매개값으로 객체의 필드를 다양하게 초기화 하는것 - 오버로딩 Overloading
	  // 매개변수를 달리하는 생성자를 여러게 생성하는것을 '생성자오버로딩 '이라한다
		//매게변수의 갯수가 같을때는 타입이 달라야하고 아니면 매게변수의 개수가 달라야한다.
	
	
	
	//필드
	String company = "현대 자동차";
	String model; 
	String color;
	String maxSpeed;
	
	//생성자
	Car(){}
	Car(String model){
		this.model = model;	
		}
	
	Car(String model, String color){
		this.model = model;	
		this.color = color;
		}
	
	
	
	Car(String model, String color, String maxSpeed){
		this.model = model;	
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

}
