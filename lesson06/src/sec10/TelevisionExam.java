package sec10;

public class TelevisionExam {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		//info�� ����Ͻÿ�.
		System.out.println(Television.info);   //�����̱⋚���� �ٷ� ���� ���μ��� ���ص���
		
		Television.method2();
		
		System.out.println();
		tv.method(500000);
	}

}
