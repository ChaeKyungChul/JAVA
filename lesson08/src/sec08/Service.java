package sec08;

public interface Service {
    //default 
	default void defaultMethod1() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();         //����Ʈ����� ��밡��
		staticCommon();
	}
	
	
	//private �޼ҵ�
	private void defaultCommon() {
		System.out.println("defalutMethod �ߺ� �ڵ�A");  //����Ʈ����߻�밡��
		System.out.println("defalutMethod �ߺ� �ڵ�B");
	}
	
	
	//���� �޼ҵ� 
	static void staticMethod1() {
		System.out.println("staticMethod12 �����ڵ�");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod12 �����ڵ�");
		staticCommon();
	}
	//private ���� �޼ҵ� 
	private static void staticCommon() {
		System.out.println("scaticMethod �ߺ��ڵ� C");
		System.out.println("scaticMethod �ߺ��ڵ� D");
	}
}
