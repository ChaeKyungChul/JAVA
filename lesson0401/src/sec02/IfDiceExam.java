package sec02;

public class IfDiceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int) (Math.random()*6+1);
			if(num ==1 ) {
				System.out.println("1���� ���Խ��ϴ�.");
			}else  if(num == 2) {
				System.out.println("2���� ���ӽ��ϴ�.");
			}else  if(num == 3) {
				System.out.println("3���� ���ӽ��ϴ�.");
			}else  if(num == 4) {
				System.out.println("4���� ���ӽ��ϴ�.");
			}else  if(num == 5) {
				System.out.println("5���� ���ӽ��ϴ�.");
			}
			
			switch(num) {
			case 1:
				System.out.println("1���� ���ӽ��ϴ�.");
				break;
			case 2:
				System.out.println("2���� ���ӽ��ϴ�.");
				break;
			case 3:
				System.out.println("3���� ���ӽ��ϴ�.");
				break;
			case 4:
				System.out.println("4���� ���ӽ��ϴ�.");
				break;
			case 5:
				System.out.println("5���� ���ӽ��ϴ�.");
				break;
			case 6:
				System.out.println("6���� ���ӽ��ϴ�.");
				break;
			default:
				System.out.println("������������");
					
			}	
		
	}

}
