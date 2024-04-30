package banking;
import java.util.Scanner;

public class BankingExeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingExe account = new BankingExe();

        System.out.println("���� ���� ���α׷�");
        System.out.println("1. �Ա�");
        System.out.println("2. ���");
        System.out.println("3. �ܰ� Ȯ��");
        System.out.println("4. ����");

        int choice;
        do {
            System.out.print("�޴��� �����ϼ���: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("�Ա��� �ݾ��� �Է��ϼ���: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("����� �ݾ��� �Է��ϼ���: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("���� �ܰ�: " + account.getBalance() + "��");
                    break;
                case 4:
                    System.out.println("���α׷��� �����մϴ�.");
                    break;
                default:
                    System.out.println("�߸��� �޴��Դϴ�. �ٽ� �������ּ���.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}