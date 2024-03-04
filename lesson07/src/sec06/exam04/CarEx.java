package sec06.exam04;

public class CarEx {
	public static void main(String[] args) {
		
		//Car 按眉 积己
		Car myCar = new Car();
		
		//Tire 按眉 厘馒
		myCar.tire = new Tire();
		myCar.run();
		
		//茄惫 鸥捞绢 按眉 流立 厘馒
		myCar.tire = new HankookTire();
		myCar.run();
		
		//陛龋 鸥捞绢 按眉 流立 厘馒
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
