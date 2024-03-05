package sec06;

public class AccountExam {

	public static void main(String[] args) {
		Account acc = new Account(); 
			//저금하기
			acc.deposit(10000000);
			System.out.println("예금액 :" + acc.getBalance()+ "0원");
			
			// 출금하기
			try {
			acc.withdraw(11000000);
		} catch (XxxException e) {
			e.printStackTrace();
		}

   
 }
}
