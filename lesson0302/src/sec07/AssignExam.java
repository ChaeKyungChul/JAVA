package sec07;

public class AssignExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;    
		result += 10;
		System.out.println(result);     //�Ʒ����߰�� 10
		
		result -= 5;
		System.out.println(result); //�Ʒ����߰�� 5
		
		result  *= 3;
		System.out.println(result); //�Ʒ����߰�� 15 
		
		result /= 5;
		System.out.println(result); //�Ʒ����߰�� 3
		
		result %= 3;
		System.out.println(result); //�Ʒ����߰�� 0
		
		
        int score = 85;
        char grade = (score >= 90) ? 'A' : ((score >= 80)? 'B' : 'C');  // 90�̻��̸� ��A 80�̻��̸� ��B �ƴϸ�C
        System.out.println(score + "���� " + grade + "�����Դϴ�."); // 85���� B�����Դϴ�.
	} 

}
