package Ex2;

public class Exam07 {

	public static void main(String[] args) {
		//7 �־��� �迭 ������ �ִ밪�� ����ϴ� �ڵ带�ۼ��Ͻÿ� (FOR���̿�)
		
		int[] array = {1, 5, 3, 8, 2};
		
		
		int max = 0;
		
		
		for(int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			
			
		}
		System.out.println("�ִ밪�� :" + max);

	}

}
