package sec10;

public class Television {
	
	//���� ����ȿ��� �ν��Ͻ� ����� ����� �� ����.
	
	int pay = 2000000;
	String color;
	
	static String company = "LG"; // �����ʵ�� �Ϲ������� �ٷ� �ʱ�ȭ�� �Ѵ�.
	static String model = "OLED";
	static String info;  // ���� ����� �����ϴ¹�� 
	static {
		info = company + "-" + model; 
	}
	void method(int getPay) {  //�ν��Ͻ� �޼ҵ�
		this.pay = getPay;
	    this.color = "����";
	    System.out.println(this.pay+", " + this.color + info);
	}
	
	static void method2() {   //�����޼ҵ�
		System.out.println(info);
	}
}
