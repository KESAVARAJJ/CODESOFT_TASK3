package codesoft_programs;

import java.util.Scanner;

public class Atmsystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

// Create a BankAccount with username, password, and initial balance
	        
	        BankAcc account = new BankAcc("user123", "pass123", 1000); 
// User authentication
	        System.out.print("Enter username: ");
	        String username = scanner.next();
	        System.out.print("Enter password: ");
	        String password = scanner.next();

	        if (account.getUsername().equals(username) && account.authenticate(password)) {
	            ATM atm = new ATM(account);
	            atm.showMenu();
	        } else {
	            System.out.println("Invalid username or password. Access denied.");
	        }

	        scanner.close();
	    }


}
