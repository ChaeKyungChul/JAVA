package sec10;

public class ClassName {
//�ν�
	int field1;
	void method() {}
	//����
	static int field2;
	static void mothod2() {}
	
	//�������
	static {
		//field1 = 10; �����Ͽ���
		//method1();  �����Ͽ���
		field2 = 10;
		mothod2(); 
 	}
	//�����޼ҵ�
	static void metho3() {
		//this.field1 = 10; //this ����Ҽ�����.
		//this.method1() ; //
		field2 = 10;
		mothod2();
	}
	
}

