package EX01;

public class Exam008 {

	public static void main(String[] args) {
		//주어진 배열 항목의 전체 합과평균을 구해 출력하는 코드를작성하세요.
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
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);

	}

}
