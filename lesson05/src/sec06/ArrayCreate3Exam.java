package sec06;

public class ArrayCreate3Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 선언과 생성
		int[] arr1 = new int[3];
		
		//초기값을 셋팅됨
		for(int i = 0; i < 3; i++) {
			System.out.println(arr1[i] + ", ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		arr1[0] = 20;
		arr1[1] = 40;
		 for(int i =  0; i <  3; i++) {
			 System.out.println(arr1[i] + ", ");
		 }
		 System.out.println();
		 System.out.println("+++++++++++++++++++++++");
		 
		 String[] arr3 = new String[4];
		 for(int i = 0 ; i < 4 ; i++) {
			 System.out.println(arr3[i] + ", ");
		 }
		 arr3[0] = "봄";
		 arr3[1] = "여름";
		 arr3[2] = "가을";
		 for(int i = 0 ; i < 4 ; i++) {
			 System.out.println(arr3[i]+ ", ");
			 
		 }
	}

}
