package banking;

public class BankingExe implements Account {
    
	private double balance ; //잔액
	
	@Override
	public void deposit(double amount) {
	 balance += amount ; // 입금액추가
	 System.out.println(amount + "원입금됨");

	}

	@Override
	public void withdraw(double amount) {  //출금
		if(balance >= amount) {
			balance -= amount; // 차감
			System.out.println(amount + "원이 출금됨");
		}else{
			System.out.println("잔액부족");
		}

	}

	@Override
	public double getBalance() {
		
		System.out.println("현재잔액:" +balance +"원");
		
		return balance;
	}

}
