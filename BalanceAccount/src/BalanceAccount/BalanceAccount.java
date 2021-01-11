package BalanceAccount;
public class BalanceAccount {

	private double amount;
	public BalanceAccount(double d) {
		if (d>0)
			amount=d;
	}
	public double getAmount() {
		return amount;
	}
	public void credit(double addAmount) {
		amount = amount+addAmount;
	}
	
}
