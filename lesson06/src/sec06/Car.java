package sec06;

public class Car {
	 //�����ε� �ڡڡڡڡڡڡڡڡڡ�
	  // �Ű������� ��ü�� �ʵ带 �پ��ϰ� �ʱ�ȭ �ϴ°� - �����ε� Overloading
	  // �Ű������� �޸��ϴ� �����ڸ� ������ �����ϴ°��� '�����ڿ����ε� '�̶��Ѵ�
		//�ŰԺ����� ������ �������� Ÿ���� �޶���ϰ� �ƴϸ� �ŰԺ����� ������ �޶���Ѵ�.
	
	
	
	//�ʵ�
	String company = "���� �ڵ���";
	String model; 
	String color;
	String maxSpeed;
	
	//������
	Car(){}
	Car(String model){
		this.model = model;	
		}
	
	Car(String model, String color){
		this.model = model;	
		this.color = color;
		}
	
	
	
	Car(String model, String color, String maxSpeed){
		this.model = model;	
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}

}
