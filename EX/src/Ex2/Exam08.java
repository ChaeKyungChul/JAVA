package Ex2;

public class Exam08 {

	public static void main(String[] args) {
		
		//�־��� �迭 �׸��� ��ü �հ������ ���� ����ϴ� �ڵ带�ۼ��ϼ���.
		
		int[][] array ={ 
				{95, 86},		
				{83, 92, 96},   
				{78, 83, 93, 87, 88} 
			};
		
		int Asum = 0;
		for(int i=0; i<array[0].length; i++) {
			Asum += array[0][i]; 
		}
		int Bsum = 0;
		for(int i=0; i<array[1].length; i++) {
			Bsum += array[1][i];
		}
		int Csum = 0;
		for(int i=0; i<array[2].length; i++) {
			Csum += array[2][i];
		}
		
		int sum = Asum+Bsum+Csum;
		double avg  = sum/3;
		
		System.out.println("��ü��:"+sum);
		System.out.println("��ü���"+avg);
		
		
		
			
		
	}

}
