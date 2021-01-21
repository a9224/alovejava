package CarLicense;

public class CarLicense {
	public static void main(String[] args) {
		String[] car = {"Tesla", "BMW", "Ford", "Mazda", 
				"Mercedes-Benz", "Porsche"};
		int[] model = {2011, 2013, 2015, 2017, 2019, 2021};
		String[] color = {"Gray", "Black", "White", "Red","Blue","Silver"};
		System.out.println("Car License Information:\n"
				+ "------------------------"
				+ "\nYour car brand: "+car[4]+
				"\nYou car model: "+model[3]+"\nCar color: "+color[1]);
		/* output:
		 * Car License Information:
			------------------------
			Your car brand: Mercedes-Benz
			You car model: 2017
			Car color: Black
		 */
	}
}


