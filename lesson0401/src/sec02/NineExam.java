package sec02;

public class NineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for(int x = 2; x <= 9; x++) {
		//	System.out.println("\n\n ***" + x + "단 ***");
			//for(int y = 1; y <= 9; y++ ) {
		//		System.out.println(x + "x" + y + "="  + (x*y));
	//		}
		//}       << for 구구단임
		
		int x = 2;
		
		while(x <= 9 ) {
			System.out.println("\n\n *** " + x + "단 ***");
			
			int y = 1;
			while(y <= 9 ) {
				System.out.println(x + "x" + y + "="  + (x*y));
			y++;
		}
			x++ ;
		}
	}
}

//위식 을 while 문으로 바꾸시오.
