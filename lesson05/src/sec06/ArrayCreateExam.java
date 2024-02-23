package sec06;

public class ArrayCreateExam {

	public static void main(String[] args) {
	
		//배열을 선언과 동시에 생성
		String[] season = {"String", "Summer", "Fall", "Winter"};
		season[1] = "여름";
		for(int i=0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		int[] scores = {83, 95, 75};
		//for문을 이용하여 총합과 평균을 구하라.
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		} 
		System.out.println("총합 :" + sum);
		double avg = (double)sum / scores.length;   //타입변환◆
		System.out.println("평균: " + avg);

 }
}