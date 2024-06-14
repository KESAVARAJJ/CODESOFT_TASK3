package codesoft_programs;
import java.util.Scanner;

public class BankAcc {
	    private double balance;
	    private String username;
	    private String password;

	    public BankAcc(String username, String password, double initialBalance) {
	        this.username = username;
	        this.password = password;
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
	            this.balance = 0;
	        }
	    }

	    public String getUsername() {
	        return username;
	    }

	    public boolean authenticate(String password) {
	        return this.password.equals(password);
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited $" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Successfully withdrew $" + amount);
	            return true;
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance for withdrawal.");
	            return false;
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	            return false;
	        }
	    }
	}

	
	