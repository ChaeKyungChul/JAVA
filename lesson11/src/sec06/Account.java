package sec06;

public class Account {
	/**
	 * 
	 * / 은행 계좌 (Account) 클래스의 출금 ( withdraw) 메소드에서 잔고(balance) 필드와 
	 * 출금액(매개값)을 비교해 잔고가 부족하면 에러를 발생시키고 throws.
	 * 은행계좌 실행 영역에서 예외처리를 함.
        **/
	//필드
	private long balance;
	
	// 생성자
	public Account() {}
	
	//메소드
	//필드값(잔금)을 가져오는 메소드
	public long getBalance() {
		return balance;
		
	}
	
	//저금을 하는 메소드 
	public void deposit(int money) {
		balance += money;
		
	}
	// 출금을 하는 메소드(잔금이 부족하면 예외를 던진다.)
	public void withdraw(int money) throws XxxException {
		if(balance < money) {
			throw new XxxException("예금 잔곤가 부족합니다. : " + (money-balance) + "원 모자랍니다" );
		}
		balance -= money;
	}
	
}
