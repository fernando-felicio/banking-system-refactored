package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankCustomer;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the ID for the new account: ");
		int accountId = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the account's name: ");
		String accountName = scanner.nextLine();
		
		BankCustomer customer = null;
		String optionDeposit = "";		
		
		do {
			System.out.println("Do you want to make an initial deposit? [Y] Yes [N] No: ");
			optionDeposit = scanner.nextLine().toLowerCase();
			
			if (optionDeposit.equals("y")) {
				System.out.println("What is the deposit amount? ");
				double initialDeposit = scanner.nextDouble();
				customer = new BankCustomer(accountId, accountName, initialDeposit);
				System.out.println(customer.toString());
								
			}else if (optionDeposit.equals("n")) {
				customer = new BankCustomer(accountId, accountName);
				System.out.println(customer.toString());
				
			}else {
				System.out.println("Invalid option");
				optionDeposit = "";
				continue;
			}
			
						
			System.out.println("Enter a deposit value: ");
			double depositValue = scanner.nextDouble();
			customer.increaseValue(depositValue);
			System.out.println(customer.toString());
			
			System.out.println("Enter a withdraw value: ");
			double withdrawValue = scanner.nextDouble();
			customer.decreaseValue(withdrawValue);
			System.out.println(customer.toString());
			break;
			
		} while (!optionDeposit.equals("n"));
		
		

		
		
		scanner.close();
		
	}

}
