package banking;
import java.util.Scanner;

public class BankingExeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingExe account = new BankingExe();

        System.out.println("계좌 관리 프로그램");
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 잔고 확인");
        System.out.println("4. 종료");

        int choice;
        do {
            System.out.print("메뉴를 선택하세요: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("입금할 금액을 입력하세요: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("출금할 금액을 입력하세요: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("현재 잔고: " + account.getBalance() + "원");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다. 다시 선택해주세요.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}