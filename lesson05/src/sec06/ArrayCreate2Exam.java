package sec06;

public class ArrayCreate2Exam {

	public static void main(String[] args) {
		//배열 변수만 선언
		int[] scores;
		
		//배열 변수에 국어, 영어, 수학 점수를 대입
		scores = new int[] {90, 95, 94};
		
		printScores(new int[] {67, 66, 80});
		

	}
//PrintScores 라는메소드 선언
	public static void printScores(int[] scores) {
		
		//매게 변수가 참조하는 배열의 항목을 출력
		for(int i = 0; i < 3 ; i++) {
			System.out.println("scores[" + i + "]:" + scores[i]);
		}
	}
}
