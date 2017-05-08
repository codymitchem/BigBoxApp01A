import java.util.Scanner;

public class BigBoxApp {

	public static void main(String args[]) {
		// display a welcome message
		System.out.println("Welcome to the Big Box App \n");

		// perform 1 or more selections
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String division = Validator.getStringNumeric(sc, "Please Enter Division Number: ", 3);

			String store = Validator.getStringNumeric(sc, "Please Enter Store Number: ", 5);
			Store ss = StoreDB.getStoreByDivisionStore(division, store);

			System.out.println("Store found for division " + division + " and store number " + store);

			System.out.println(ss);

			// see if the user wants to continue
			choice = Validator.getString(sc, "Continue? (y/n):  ");
			System.out.println();
		}
	}
}