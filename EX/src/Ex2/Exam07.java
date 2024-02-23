package Ex2;

public class Exam07 {

	public static void main(String[] args) {
		//7 주어진 배열 값에서 최대값을 출력하는 코드를작성하시오 (FOR문이용)
		
		int[] array = {1, 5, 3, 8, 2};
		
		
		int max = 0;
		
		
		for(int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			
			
		}
		System.out.println("최대값은 :" + max);

	}

}
