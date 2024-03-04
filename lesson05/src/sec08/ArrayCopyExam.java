package sec08;

public class ArrayCopyExam {

	public static void main(String[] args) {
		
		//���̰� 3�� �迭�� ����
		String[] oldStrArr = {"Java", "JavaScript", "mysql"};
		
		//���̰� 5�� �迭 ���λ���
		String[] newStrArr = new String[5];
		
		//���̰� 3�� �迭�� �׸��� 5�� �迭�� ����
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