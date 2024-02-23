package sec08;

public class ArrExam {

	public static void main(String[] args) {
		
		ArrMethod arrs = new ArrMethod();
		
	    int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int rs = arrs.sum(nums);                                //배열에 안에 하려면 new int[] 추가 해줘야됨
		System.out.println("1부터 10까지의 합은 : " + rs);
		

		int rs2 = arrs.sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11);
		System.out.println("1부터 11까지의 합은 : " + rs2);
		
	}

}
