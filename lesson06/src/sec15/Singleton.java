package sec15;

public class Singleton {
	
	private static Singleton singleton;
	// private ���� ������ ���� ���� �ʵ� �������� �ʱ�ȭ
	Singleton singlton = new Singleton();
	
	// �����ڴ� private �� �ܺ� ������ ����
	 private Singleton() {}
	 
	 // public ������ ���� �޼ҵ带 ����� �ʵ带 ���
	 public static Singleton getInstance() {
		 return singleton;
	 }
}
