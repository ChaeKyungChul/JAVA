package sec01;

public class ErrExample {

	public static void main(String[] args) {
		
		try {
			int value = Integer.parseInt("loo");
		}catch(NumberFormatException e) {
			System.err.println("�����ߛ�");
			System.err.println(e.getMessage());
		}

	}

}
