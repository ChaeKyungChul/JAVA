package sec06;

public class CalculatorExam {

	public static void main(String[] args) {
	 
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		int r1 = myCalc.add(5, 8);
		System.out.println("µ¡¼À°á°ú : "+ r1);
		
		int x = 10, y = 30; 
		double r2 = myCalc.divide(x, y);
		System.out.println("³ª´°¼À°á°ú :" + r2);

		myCalc.powerOn();
	}

}
