package sec03;

public class RefVarExam {

	public static void main(String[] args) {
		
		int[] arr1; //배열변수 arr1 선언 
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1 ,2, 3};   // 배열 {1, 2, 3} 생성한다음에 그 배열을 arr1에 넣음 대입
		arr2 = new int[] {1, 2, 3}; //배열 {1, 2, 3}을 생성 한다음에 그 배열을 arr2 에 대입 
		arr3 = arr2; // 배열변수 arr2 의 값을 arr3에 대입

		System.out.println(arr1 == arr2); //false
		System.out.println(arr2 == arr3); //true
	}

}
