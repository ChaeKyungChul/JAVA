package banking;

public class BankingExe implements Account {
    
	private double balance ; //�ܾ�
	
	@Override
	public void deposit(double amount) {
	 balance += amount ; // �Աݾ��߰�
	 System.out.println(amount + "���Աݵ�");

	}

	@Override
	public void withdraw(double amount) {  //���
		if(balance >= amount) {
			balance -= amount; // ����
			System.out.println(amount + "���� ��ݵ�");
		}else{
			System.out.println("�ܾ׺���");
		}

	}

	@Override
	public double getBalance() {
		
		System.out.println("�����ܾ�:" +balance +"��");
		
		return balance;
	}

}
