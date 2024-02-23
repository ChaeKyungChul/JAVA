package sec03;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 문에서 continue 를 이용하여 1~10 까지 정수증 짞수만 출력하라.
		
		for(int i = 1; i <= 10; i++ ) {
			if(i%2!=0) {
				continue;
			}
		System.out.println(i);
	}

    }
}
