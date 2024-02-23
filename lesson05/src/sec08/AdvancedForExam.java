package sec08;

public class AdvancedForExam {

	public static void main(String[] args) {
		

		int[] scores = {95, 71, 35, 69, 77, 88, 15 };
		// 이배열의 전체 합을 햐앙된 for문을 이용하여 구하라.
		// 그리고 평균도 구하라
		
		int sum = 0;
		for(int score : scores) {
			// sum += scores;
			sum = sum + score;
		}
		System.out.println("정수 총합 :" + sum);
		// 평균
		double avg = (double) sum / scores.length;
		
		System.out.println("점수 평균 "+ avg);
		
	}

}
