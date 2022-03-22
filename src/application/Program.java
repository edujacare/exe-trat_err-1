package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double iniBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account acc = new Account(number, holder, iniBalance, withdrawLimit);
			
		try {
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount); 
			
			System.out.printf("%.2f", acc.getBalance());
		}
		
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		/* catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		} */
		
		
		sc.close();
	}
}
