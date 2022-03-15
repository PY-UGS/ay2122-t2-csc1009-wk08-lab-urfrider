import java.util.Scanner;

public class BankDemoTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			CheckingAccount account = new CheckingAccount(0, "12345678");
			System.out.print("Deposit amount: ");
			double amount = sc.nextDouble();
			account.deposit(amount);
			System.out.print("Withdrwal amount: ");
			amount = sc.nextDouble();
			account.withdraw(amount);
		}catch(InsufficientFundsException e){
			System.out.println("Sorry but your account is short by: $" + e.getAmount());
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

}
