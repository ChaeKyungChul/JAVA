package sec08;

public class AdvancedForExam {

	public static void main(String[] args) {
		

		int[] scores = {95, 71, 35, 69, 77, 88, 15 };
		// �̹迭�� ��ü ���� ��ӵ� for���� �̿��Ͽ� ���϶�.
		// �׸��� ��յ� ���϶�
		
		int sum = 0;
		for(int score : scores) {
			// sum += scores;
			sum = sum + score;
		}
		System.out.println("���� ���� :" + sum);
		// ���
		double avg = (double) sum / scores.length;
		
		System.out.println("���� ��� "+ avg);
		
	}

}
