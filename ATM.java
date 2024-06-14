package codesoft_programs;

import java.util.Scanner;

public class ATM {
	
	    private BankAcc account;

	    public ATM(BankAcc account) {
	        this.account = account;
	    }

	    public void showMenu() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    deposit(scanner);
	                    break;
	                case 3:
	                    withdraw(scanner);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private void checkBalance() {
	        System.out.println("Your current balance is $" + account.getBalance());
	    }

	    private void deposit(Scanner scanner) {
	        System.out.print("Enter deposit amount: ");
	        double amount = scanner.nextDouble();
	        account.deposit(amount);
	    }

	    private void withdraw(Scanner scanner) {
	        System.out.print("Enter withdrawal amount: ");
	        double amount = scanner.nextDouble();
	        account.withdraw(amount);
	    }
	}

