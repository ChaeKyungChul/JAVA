package sec05;

public class Student {
		//�ʵ�   : ��ü�� �����Ͱ� ����Ǵ°� 
	
	int age;              //ö�� �Է��ؼ��ٲܼ������� ������ 
	String name;		 // ���� �Է��ؼ��ٲܼ������� ������
	int grade;				 // 4 �Է��ؼ��ٲܼ������� ������
		//������ Student(){}   : ��ü������ �ʱ�ȭ ��Ȱ ��� // �����ڴ� �������� �ڵ��������� <�۾��ϴ°�
	Student(int age, String name, int grade){
		this.age = age;  // this �ʵ尪�ʱ�ȭ�����ִ°�  , ��> age �Ű���
		this.name = name;
		this.grade = grade;
	}
	
	
	
	
	
		//�޼ҵ�  : ��ü�� �������� ȣ��� ����Ǵ� ��
	public void stydy() {
		System.out.println("�����ð����� ���θ� ������ �մϴ�.");
	}
	public void home() {
		System.out.println("������ ������ ���� ���ô� �޷�.");
	}
	
	}

