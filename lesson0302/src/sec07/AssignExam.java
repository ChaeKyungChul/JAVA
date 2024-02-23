package sec07;

public class AssignExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 0;    
		result += 10;
		System.out.println(result);     //아래로쭉계산 10
		
		result -= 5;
		System.out.println(result); //아래로쭉계산 5
		
		result  *= 3;
		System.out.println(result); //아래로쭉계산 15 
		
		result /= 5;
		System.out.println(result); //아래로쭉계산 3
		
		result %= 3;
		System.out.println(result); //아래로쭉계산 0
		
		
        int score = 85;
        char grade = (score >= 90) ? 'A' : ((score >= 80)? 'B' : 'C');  // 90이상이면 참A 80이상이면 참B 아니면C
        System.out.println(score + "점은 " + grade + "동급입니다."); // 85점은 B동급입니다.
	} 

}
