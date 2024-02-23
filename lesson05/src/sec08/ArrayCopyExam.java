package sec08;

public class ArrayCopyExam {

	public static void main(String[] args) {
		
		//길이가 3인 배열을 만듬
		String[] oldStrArr = {"Java", "JavaScript", "mysql"};
		
		//길이가 5인 배열 새로생성
		String[] newStrArr = new String[5];
		
		//길이가 3인 배열의 항목을 5인 배열에 복사
		System.arraycopy(oldStrArr, 0, newStrArr, 2, oldStrArr.length);
		
		for(int i = 0; i < newStrArr.length; i++) {
			System.out.print(newStrArr[i] + ", ");
		}
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		for(String str : newStrArr) {
			System.out.print(str + ", ");
		}

		
	}

}
