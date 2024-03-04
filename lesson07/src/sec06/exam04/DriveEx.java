package sec06.exam04;

public class DriveEx {
	
	public static void main (String[] args) {
		//driver 객체 생성
		Driver driver = new Driver();
		
		//매개값을 이용하여 다향성 구현
		Bus bus = new Bus();
		driver.drive(bus);
		
		Texi taxi = new Texi();
		driver.drive(taxi);
	}
}
