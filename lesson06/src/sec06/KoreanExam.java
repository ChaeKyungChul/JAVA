package sec06;

public class KoreanExam {
	
	public static void main(String[] args) {
	Korean k1 = new Korean("��ö��", "123123-123132", 65);
	Korean k2 = new Korean("�̿���", "123123-123132", 50);
	
	
	System.out.println("���� :" +k1.nation);
	System.out.println(k1.name + ", " + k1.age + "��, " + k1.ssm);
	
	
	System.out.println(k2.name + ", " + k2.age + "��, " + k2.ssm);
	
}

}		
	