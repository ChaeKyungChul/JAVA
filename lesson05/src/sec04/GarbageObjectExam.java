package sec04;

public class GarbageObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String hobby = "����" ; //  �������� "����" �̶�� ��ü�� �����ǰ� �ּҰ� hobby�� �Ҵ�
				hobby = null ; // �����̶�� String ��ü�� �����Ⱑ��
				
				String bestCar = "����Ƽ��";
				String worstCar = bestCar; //bestCar �� ����� ����Ƽ�� ��ü ������ worstCar�� ����
				bestCar = null; // bestCar�����Ⱑ��      '����Ƽ��' ��ü�� ��Ȳ��????? ��������  
				
				System.out.println(worstCar);
		}

}
