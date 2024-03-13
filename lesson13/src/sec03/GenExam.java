package sec03;

public class GenExam {

	public static void main(String[] args) {
		
		Product<Tv, String> pr1 = new Product<>(); //K를 Tv로 대체 , M은 String 으로 대체

		pr1.setKind(new Tv());
		pr1.setModel("스마트Tv");
		
		
		//Gerrter 리턴값이 Tv와 String이 됨.
		Tv tv = pr1.getKind();
		String tvModel = pr1.getModel();
		
		//Car 타입 이용 Car 객체를 생성
		Product<Car, String> pr2= new Product<>();  //Car, String <Car, String>안에 넣어도됨
		pr2.setKind(new Car());
		pr2.setModel("테슬라 Mdel5");
		
		Car car = pr2.getKind();
		String carModel = pr2.getModel();
	}

}
