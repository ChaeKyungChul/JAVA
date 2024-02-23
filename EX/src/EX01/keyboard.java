package EX01;

public class keyboard {
	void powerOn(){
		System.out.println("전원On");
	}
	void powerOff() {
		System.out.println("전원Off");
	}
	double add (int x, int y) {
		double result = x + y;
		return result;
	}
	double minus (int x, int y) {
		double result = x - y;
		return result;
	}
	double multiply(int x, int y) {
		double result = (double) x*y;
		return result;
	}
	double divide(int x, int y) {
		double  result = (double) x / y;
		return result;
	}	
}

