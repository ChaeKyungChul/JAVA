package exam132.package2;

import exam132.package1.*;

public class C {
     //�޼ҵ� ����� �ҷ���
	public void methodB() {
		//A Ŭ������ ��ü�� ����
		A a = new A();
		
		//a�� �ʵ带 ����
		a.field1 = 11;  // public �ʵ�� ��Ŭ�������� ���氡��
	//	a.field2 = 21; // default  �ٸ���Ű���� �Ұ���
	//	a.field3 = 31;  // privite �ʵ�� �ܺ� Ŭ�������� ������ �Ұ��� 
		
		//�޼ҵ� ȣ�� 
		a.method1();
		//a.method2();  <�ٸ���Ű���� �Ұ���
		//a.method3(); // privite �ʵ�� �ܺ� Ŭ�������� ������ �Ұ��� 
	}
	 
	
}
