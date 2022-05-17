import java.util.Scanner;

public class ShujayHW {
	public static void main(String[] args) {

		name();
	}

	public static void name() {
		String name;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Enter Name");
		name = keyboard.next();

		while(!name.equals("Md") || !name.equals("Rowshon") || !name.equals("Ramzan")) {
			
			System.out.println("Invalid Name");
			System.out.println("Please ReEnter A valid Name");
			name = keyboard.next();

			switch(name) {

			case "Md":
				System.out.println("Please Enter First Name");
				break;

			case "Ramzan":
				System.out.println("Please Enter Middle name");

				break;

			case "Rowshon":
				System.out.println("Please Enter Last Name");
				break;

			}
			
		}
		
		keyboard.close();
	}
}
