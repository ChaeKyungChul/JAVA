package sec06;

public class CarExam {

	public static void main(String[] args) {
		
		Car c1 = new Car(); 
		Car c2 = new Car("제네시스", "빨강", "100");
		
		System.out.println(c1.company);
		System.out.println(c2.company+ ", " + c2.model + ", "+ c2.color);
		System.out.println(c2.company+ ", " + c2.model + ", "+ 
						   c2.color + ", " +c2.maxSpeed);
		
		
	}

}
