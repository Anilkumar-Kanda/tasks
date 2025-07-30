package java_oops_tasks;
// Task-3

class Bank{
	String accountNumber;
	private double balance;
	
	public void deposite(double amount) {
		if(amount > 0) {
			balance  += amount;
			System.out.println("Deposited: " + amount);
		}else {
			System.out.println("Inavlid deposite amount.");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount<= balance) {
			balance -= amount;
			System.out.println("withdrew: " + amount);
		}else {
			System.out.println("Insufficient balance:");
		}
	}
	public double getBalance() {
		return balance;
	}
}

public class BankAccound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank acc = new Bank();
		acc.deposite(100000);
		acc.withdraw(5000);
		System.out.println("Remaining balance: " +acc.getBalance());

	}

}
