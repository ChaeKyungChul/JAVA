package sec04;

public class Exe04Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			while(true) {
				int ju1 = (int)(Math.random()*6 + 1);
				int ju2 = (int)(Math.random()*6 + 1);
				System.out.println("주사위 1, 2의 값 " + ju1 +"," + ju2);
				if(ju1+ju2==5) {
					break;
				}
			}
			
			for(int x=1; x <= 10; x++ ) {
				for(int y =1; y <= 10; y++) {
					if((4*x + 5*y) ==60) {
						System.out.println("4" + x + "+ " + "5" + y);
					}
				}
			}
	}

}
