package BalanceAccount;

import java.util.Scanner;

public class BalanceAccountTest {
	public static void main(String[] args) {
		
		BalanceAccount account1 = new BalanceAccount(40.00);
		BalanceAccount account2 = new BalanceAccount(0.00);
		Scanner input = new Scanner(System.in);
		double a1,a2;
		System.out.printf("account1 balance: %.2f\n",account1.getAmount());
		System.out.printf("account2 balance: %.2f\n\n",account2.getAmount());
		
		System.out.print("Enter deposit amount for account1: ");
		a1 = input.nextDouble();
		account1.credit(a1);
		System.out.printf("\nadding %.2f to account1 "
				+ "balance\n",account1.getAmount());
		System.out.printf("account1 balance: %.2f\n",account1.getAmount());
		System.out.printf("account2 balance: %.2f\n\n",account2.getAmount());
		// for account 2
		System.out.print("Enter deposit amount for account2: ");
		a2 = input.nextDouble();
		account2.credit(a2);
		System.out.printf("\nadding %.2f to account2 "
				+ "balance\n",account2.getAmount());
		System.out.printf("account1 balance: %.2f\n",account1.getAmount());
		System.out.printf("account2 balance: %.2f\n\n",account2.getAmount());
		

		
	}
}
