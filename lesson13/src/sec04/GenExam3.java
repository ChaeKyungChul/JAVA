package sec04;

public class GenExam3 {

	public static<T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}

	
	//���� �޼Ҥ�
	
	public static void main(String[] args) {
		//���׸� �޼ҵ� ȣ��
		Box<Integer> box1 = boxing(100);
		int intValue = box1. get();
		System.out.println(intValue);
		
		//���׸� �޼ҵ带 String Ÿ������ ȣ�� ȫ�浿�� ��������
		Box<String> box2 = boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
