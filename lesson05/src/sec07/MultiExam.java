package sec07;

public class MultiExam {

	public static void main(String[] args) {
		
		int[][] scores = {
				{15, 25, 35},
				{50, 70, 30, 40, 90 }
				
					
		};
		//�迭�� ����
				System.out.println(scores.length);
				System.out.println(scores[0].length);
				System.out.println(scores[1].length);
				//ù��° ���� ����° �л�������?
				System.out.println(scores[0][2]);
				//�ι�° ���� �ι�° �л�������?
				System.out.println(scores[1][1]);
				//ù��° ���� ���������?
				int fclassSum = 0;
				for(int i=0; i<scores[0].length; i++) {
					fclassSum += scores[0][i];
				}
				double fclassAvg = (double) fclassSum / scores[0].length;
				System.out.println(fclassAvg);
				//�ι��� ���� ���������?
				int dclassSum = 0;
				for(int i=0; i<scores[1].length; i++) {
					dclassSum += scores[1][i];
				}
				
				double dclassAvg = (double) dclassSum / scores[1].length;
				System.out.println(dclassAvg);
				
				//��ü�����?
				
				int totalStudent = 0 ;
				int totalSum = 0;
				for(int i = 0; i<scores.length; i++) {          //���� �� ��ŭ �ݺ��Ѵ�.
					totalStudent += scores[i].length;               // ������ �л����� ���Ѵ�.
					for(int j = 0 ; j<scores[i].length; j++) {  // �ش���� �л��� ��ŭ �ݺ��Ѵ�.
						totalSum += scores[i][j];   	//�л� ������ �ջ��Ѵ�.
					}
				}
				double totalAvg = (double) totalSum / totalStudent;
				System.out.println(totalAvg);
				
	   }

	}


