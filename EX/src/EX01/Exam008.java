package EX01;

public class Exam008 {

	public static void main(String[] args) {
		//�־��� �迭 �׸��� ��ü �հ������ ���� ����ϴ� �ڵ带�ۼ��ϼ���.
		int[][] array ={ 
				{95, 86},		
				{83, 92, 96},   
				{78, 83, 93, 87, 88} 
			};
		
		int sum =0;
		double avg = 0.0;
		
		int ct = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				ct++;
			}
			
		}
		
		avg = (double) sum / ct;
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + avg);

	}

}
