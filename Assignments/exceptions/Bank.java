package exceptions;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(7000);
		Scanner sc = new Scanner(System.in);
		System.out.println("1--> Deposit  2-->withdraw");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("How many amount you depoisted");
			double amount = sc.nextInt();
			account.deposit(amount);
		}

		else {
			try {
				System.out.println("How many amount you withdraw");
				double amount = sc.nextInt();
				account.withdraw(amount);
			} catch (InsufficientBalanceException e) {
				System.out.println("Transaction Failed: " + e.getMessage());
			}

			System.out.println("Current balance: " + account.getBalance());
		}
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance for the requested withdrawal.");
		}
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}
