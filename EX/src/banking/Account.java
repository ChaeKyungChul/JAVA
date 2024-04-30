package banking;

public interface Account {

	    void deposit(double amount);  // 입금
	    void withdraw(double amount); // 출금
	    double getBalance();           // 잔고
	}

