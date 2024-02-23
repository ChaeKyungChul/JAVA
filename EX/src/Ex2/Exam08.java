package Ex2;

public class Exam08 {

	public static void main(String[] args) {
		
		//주어진 배열 항목의 전체 합과평균을 구해 출력하는 코드를작성하세요.
		
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
		
		System.out.println("전체합:"+sum);
		System.out.println("전체평균"+avg);
		
		
		
			
		
	}

}
