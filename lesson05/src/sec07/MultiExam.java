package sec07;

public class MultiExam {

	public static void main(String[] args) {
		
		int[][] scores = {
				{15, 25, 35},
				{50, 70, 30, 40, 90 }
				
					
		};
		//배열의 길이
				System.out.println(scores.length);
				System.out.println(scores[0].length);
				System.out.println(scores[1].length);
				//첫번째 반의 세번째 학생점수는?
				System.out.println(scores[0][2]);
				//두번째 반의 두번째 학생점수는?
				System.out.println(scores[1][1]);
				//첫번째 반의 평균점수는?
				int fclassSum = 0;
				for(int i=0; i<scores[0].length; i++) {
					fclassSum += scores[0][i];
				}
				double fclassAvg = (double) fclassSum / scores[0].length;
				System.out.println(fclassAvg);
				//두번재 반의 평균점수는?
				int dclassSum = 0;
				for(int i=0; i<scores[1].length; i++) {
					dclassSum += scores[1][i];
				}
				
				double dclassAvg = (double) dclassSum / scores[1].length;
				System.out.println(dclassAvg);
				
				//전체평균은?
				
				int totalStudent = 0 ;
				int totalSum = 0;
				for(int i = 0; i<scores.length; i++) {          //반의 수 만큼 반복한다.
					totalStudent += scores[i].length;               // 각반의 학생수를 합한다.
					for(int j = 0 ; j<scores[i].length; j++) {  // 해당반의 학생수 만큼 반복한다.
						totalSum += scores[i][j];   	//학생 점수를 합산한다.
					}
				}
				double totalAvg = (double) totalSum / totalStudent;
				System.out.println(totalAvg);
				
	   }

	}


