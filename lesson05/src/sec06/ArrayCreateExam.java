package sec06;

public class ArrayCreateExam {

	public static void main(String[] args) {
	
		//�迭�� ����� ���ÿ� ����
		String[] season = {"String", "Summer", "Fall", "Winter"};
		season[1] = "����";
		for(int i=0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		int[] scores = {83, 95, 75};
		//for���� �̿��Ͽ� ���հ� ����� ���϶�.
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		} 
		System.out.println("���� :" + sum);
		double avg = (double)sum / scores.length;   //Ÿ�Ժ�ȯ��
		System.out.println("���: " + avg);

 }
}