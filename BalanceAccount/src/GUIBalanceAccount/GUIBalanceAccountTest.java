package GUIBalanceAccount;

import java.util.Scanner;
import javax.swing.JOptionPane;
import BalanceAccount.BalanceAccount;
public class GUIBalanceAccountTest {
	public static void main(String[] args) {
		BalanceAccount account1 = new BalanceAccount(40.00);
		BalanceAccount account2 = new BalanceAccount(0.00);
		Scanner input = new Scanner(System.in);
		double a1,a2;
		JOptionPane.showMessageDialog(null, String.format("account1 balance: "
				+ "%.2f\naccount2 balance: %.2f", 
				account1.getAmount(),account2.getAmount()));
		String m1=JOptionPane.showInputDialog("Enter deposit "
				+ "amount for account1:");
		a1 = Double.parseDouble(m1);
		account1.credit(a1);
		JOptionPane.showMessageDialog(null, String.format("adding %.2f to "
				+ "account1 balance\naccount1 balance: %.2f\naccount2 balance: "
				+ "%.2f", account1.getAmount(),account1.getAmount(),
				account2.getAmount()));
		// for account 2
		String m2=JOptionPane.showInputDialog("Enter deposit "
				+ "amount for account2:");
		a2 = Double.parseDouble(m2);
		account2.credit(a2);
		JOptionPane.showMessageDialog(null, String.format("adding %.2f to "
				+ "account2 balance\naccount1 balance: %.2f\naccount2 balance: "
				+ "%.2f", account2.getAmount(),account1.getAmount(),
				account2.getAmount()));
	}

}
