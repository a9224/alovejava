package GUIBalanceAccount;

public class GUIBalanceAccount {
	private double amount;

	
	public GUIBalanceAccount(double d) {
		if (d>0)
		 amount = d;
	}

	public double getAmount() {
		return amount;
	}

	public void credit(double addAmount) {
		amount = amount+addAmount;
	}
	

}
