public class CheckingAccount {
	private double balance;
	private String accountNumber;
	
	public CheckingAccount(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(double amount) {
		if (amount < 1) {
			throw new IllegalArgumentException("You cannot deposit $0 and below");
		}else {
			this.balance += amount;
			System.out.println("$" + this.balance + " has been deposited");
		}
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException(amount - balance);
		}else if(amount < 1) {
			throw new IllegalArgumentException("You cannot withdraw $0 and below");
		}
		else {
			this.balance -= amount;
			System.out.println("The balance after withdraw is: $" + this.balance);
		}
	}
	
}
