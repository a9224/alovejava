package PostalCode;
import java.util.Scanner;

public class PostalCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int zipCode;
		System.out.println("Postal code of Kuwait (Type 0 to exit)\n"
				+ "--------------------------------------");
		System.out.print("Postal code of: ");
		zipCode = input.nextInt();
		if (zipCode!=0)
			SwitchStatement(zipCode);
		else 
			System.out.println("--------------------------------------");
		while (zipCode != 0)
		{
			System.out.print("Postal code of: ");
			zipCode = input.nextInt();
			if (zipCode!=0)
				SwitchStatement(zipCode);
			else 
				System.out.println("--------------------------------------");
		}
	}

	private static void SwitchStatement(int zipCode) {
		String city;
		switch(zipCode) {
			case 71801:
				city = "Kaifan";
				break;
			case 71501:
				city = "Shamiya";
				break;
			case 40000:
				city = "Meshref";
				break;
			case 43600:
				city = "Bayan";
				break;
			case 00003:
				city = "Al Jahra";
				break;
			case 92420:
				city = "Sabah Al naseer";
				break;
			default:
				city = "Unknown";
				break;
		}
		System.out.println("Kuwait, "+city+"\n");
	}
}
