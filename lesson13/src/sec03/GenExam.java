package sec03;

public class GenExam {

	public static void main(String[] args) {
		
		Product<Tv, String> pr1 = new Product<>(); //K�� Tv�� ��ü , M�� String ���� ��ü

		pr1.setKind(new Tv());
		pr1.setModel("����ƮTv");
		
		
		//Gerrter ���ϰ��� Tv�� String�� ��.
		Tv tv = pr1.getKind();
		String tvModel = pr1.getModel();
		
		//Car Ÿ�� �̿� Car ��ü�� ����
		Product<Car, String> pr2= new Product<>();  //Car, String <Car, String>�ȿ� �־��
		pr2.setKind(new Car());
		pr2.setModel("�׽��� Mdel5");
		
		Car car = pr2.getKind();
		String carModel = pr2.getModel();
	}

}
