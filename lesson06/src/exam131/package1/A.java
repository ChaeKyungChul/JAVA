package exam131.package1;

public class A {
	//�ʵ弱��
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	//public ���������� ���� ������ ����
	public A(boolean b) {};  //1��° ���� �����
	
	//defalt ���� �������� ������ ����
     A(int b) {};    //2��° ���������
	
	//private ���� �������� ������ ����
	private A(String s) {}; //3��° ��������� , // �������� �����ε� 
	

}
