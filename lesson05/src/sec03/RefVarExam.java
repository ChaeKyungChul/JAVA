package sec03;

public class RefVarExam {

	public static void main(String[] args) {
		
		int[] arr1; //�迭���� arr1 ���� 
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1 ,2, 3};   // �迭 {1, 2, 3} �����Ѵ����� �� �迭�� arr1�� ���� ����
		arr2 = new int[] {1, 2, 3}; //�迭 {1, 2, 3}�� ���� �Ѵ����� �� �迭�� arr2 �� ���� 
		arr3 = arr2; // �迭���� arr2 �� ���� arr3�� ����

		System.out.println(arr1 == arr2); //false
		System.out.println(arr2 == arr3); //true
	}

}