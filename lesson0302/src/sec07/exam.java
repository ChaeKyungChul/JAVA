package sec07;

public class exam {

	public static void main(String[] args) {
		
//		1.  ���� �ڵ带 �������� �� ��� ����� �ۼ��غ�����.
		 int x = 6;
		 int y = 3;
		 int z = (++x) + (y--);
		 System.out.println(z);   //31

//       2.		. ���� �ڵ带 �������� �� ��� ����� �ۼ��غ�����
		 int score = 85;
		 String result = (!(score>90))? "��":"��";  //!=false ,  ���ھ�>90 false = true
		 System.out.println(result);   //��
		 
//		 3. 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� 1�δ� �� ���� ���� �� �ְ�, 
//		 �������� �� ���� �������� ���ϴ�
		 
		 int pencils = 534;
		 int students = 30;
		 //�л� �� ���� ������ ���� ��    534/30
     //  	int pencilsPerStudent = ( PerStudent   /     pencils     ); 
		//System.out.println(pencilsPerStudent);
		 //���� ���� ��
	//	int pencilsLeft = (                   );
     //   System.out.println(pencilsLeft);
		 
		 
//4. ������ ���� �ڸ� ���ϸ� ������ �ڵ��Դϴ�. ���� value�� ���� 356�̶�� 300�� ���� �� �ֵ�
//		 �� (  )�� �˸��� �ڵ带 �ۼ��ϼ���(��� �����ڸ� ���).
		 
		 // 356 / 100   ��Ƽ�� ��>����ȯ ��> ���ϱ�100
		 // value / 100 * 100
		 int value = 356;
		 int value2 = 56;
		 System.out.println( value - value2 );  
		 
	// 7. ������ % ������ ������ ������� 10�� ���ϴ� �ڵ��Դϴ�. NaN ���� �˻��ؼ� �ùٸ� ����� 
	//	 ��µ� �� �ֵ��� (  )�� �� �ڵ带 �ۼ��غ�����.
		 
		 
	// double x = 5.0;
	// double y = 0.0;
	// double z = 5 % y;
	//	 if (        Double.isNAN(z)  
	//	) {
	//	 System.out.println("0.0���� ���� �� �����ϴ�.");
	//	 } else {
	// double result = z + 10;
    //  System.out.println("���: " + result);
		 	 
	}

}
