import java.util.Scanner;

public class MethodsWithParm {

	public static String firstName;
	public static String lastname;
	public static String rollNumber;
	public static double markBengali;
	public static double markEng;
	public static double markMath;
	public static double markBio;
	//    public static double averageMark;
	public static double total;

	public static void main(String args[]) {
		//		askUserAndGetAvg();
		//		userOutput();

		switchMethod();
	}


	public static char gradeCalculation(double averageMark) {

		char grade = ' ';


		if (averageMark >= 90 && averageMark <= 100) {
			grade = 'A';
			System.out.println("You got a grade A ");
		} else if (averageMark >= 80 && averageMark <= 89) {
			grade = 'B';
			System.out.println("You got a grade B ");
		} else if (averageMark >= 70 && averageMark <= 79) {
			grade = 'C';
			System.out.println("You got a grade C ");
		} else if (averageMark >= 60 && averageMark <= 69) {
			grade = 'D';
			System.out.println("You got a grade D ");
		} else if (averageMark >= 50 && averageMark <= 59) {
			grade = 'E';
			System.out.println("You got a grade E ");
		} else {
			grade = 'F';
			System.out.println("You got a grade F ");
		}

		return grade;

	}

	public static void userOutput() {

		System.out.println("My name is: " + firstName + " " + lastname + "\n" +
				"My roll number is: " + rollNumber + "\n" +
				"My mark for Bengali is: " + markBengali + "\n" +
				"My mark for English is: " + markEng + "\n" +
				"My mark for Math is: " + markMath + "\n" +
				"My mark for Biology is: " + markBio + "\n" +
				"My grade is: " + gradeCalculation(getAverageMark()) +"\n" +
				"My average is: " + getAverageMark());

	}

	public static void askUserAndGetAvg() {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter your first name: ");
		firstName = userInput.next();

		System.out.println("Please enter your last name: ");
		lastname = userInput.next();

		System.out.println("Please enter your roll number: ");
		rollNumber = userInput.next();

		System.out.println("Please enter the marks for Bengali: ");
		markBengali = userInput.nextDouble();
		for (int i = 0; i < 5; i++) {
			if (markBengali < 0 || markBengali > 100) {
				System.out.println("Please enter valid marks between 0 to 100: ");
				markBengali = userInput.nextDouble();
			} else {
				total = total + markBengali;
				i = 6;
			}
		}


		System.out.println("Please enter the marks for English: ");
		markEng = userInput.nextDouble();
		for (int j = 0; j < 5; j++) {
			if (markEng < 0 || markEng > 100) {
				System.out.println("Please enter valid marks between 0 to 100: ");
				markEng = userInput.nextDouble();
			} else {
				total = total + markEng;
				j = 6;
			}
		}


		System.out.println("Please enter the marks for Math: ");
		markMath = userInput.nextDouble();
		for (int k = 0; k < 3; k++) {
			if (markMath < 0 || markMath > 100) {
				System.out.println("Please enter valid marks between 0 to 100: ");
				markMath = userInput.nextDouble();
			} else {
				total = total + markMath;
				k = 6;
			}
		}


		System.out.println("Please enter the marks for Biology: ");
		markBio = userInput.nextDouble();

		for (int l = 0; l < 5; l++) {
			if (markBio < 0 || markBio > 100) {
				System.out.println("Please enter valid marks between 0 to 100: ");
				markBio = userInput.nextDouble();
			} else {
				total = total + markBio;
				l = 6;
			}
		}


	}

	public static double getAverageMark() {
		double getAvg;
		double getAvg1; 
		getAvg = total / 4;
		return getAvg;
	}



	public static void switchMethod() {

		String value1;

		Scanner k = new Scanner(System.in);

		System.out.println("Please Enter Name");
		value1 = k.next();
		
		
		while(!value1.equals("Anjan") || !value1.equals("Kabir") || !value1.equals("Dipu") || !value1.equals("FNU")) {
		
			switch(value1) {

			case "Anjan":

				System.out.println("Valid Name1");
				break;

			case "FNU":
				System.out.println("Valid Name2");

				break;
			case "Dipu":

				System.out.println("Valid Name3");
				break;

			case "Kabir":
				System.out.println("Valid Name4");
				break;

			default: 
				System.out.println("InValid Name");
				System.out.println("Please ReEnter A Valid Name");
			}
			
			value1 = k.next();

		}	
	}

}
