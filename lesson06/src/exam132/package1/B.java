package exam132.package1;

public class B {
     //�޼ҵ� ����� �ҷ���
	public void methodB() {
		//A Ŭ������ ��ü�� ����
		A a = new A();
		
		//a�� �ʵ带 ����
		a.field1 = 11;  // public �ʵ�� ��Ŭ�������� ���氡��
		a.field2 = 21; // default �ʵ�� ���� Ŭ���� �̹Ƿ� ���氡��
	//	a.field3 = 31;  // privite �ʵ�� �ܺ� Ŭ�������� ������ �Ұ��� 
		
		//�޼ҵ� ȣ�� 
		a.method1();
		a.method2();
		//a.method3(); // privite �ʵ�� �ܺ� Ŭ�������� ������ �Ұ��� 
	}
	 
	
}
