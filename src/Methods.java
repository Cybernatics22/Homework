import java.util.Scanner;

public class Methods {
	static double value1;
	static double value2;
	static double value3;
	static double value4;
	static String choice;
//	static double total;
	
   public static void main (String []args) {
	   userInput();
//	   calculation();  
	   average();
	}
	
	public static void userInput() {
		Scanner keyboard = new Scanner(System.in); 
//		 double value1;
//		 double value2;
//		 String choice;
		
		
	    System.out.println("Please Enter Value 1 : ");
	    value1= keyboard.nextDouble();
	    
//	    System.out.println(value1);
	    
	    System.out.println("PLease Enter Value 2 : ");
	    value2 = keyboard.nextDouble();
	    
	    System.out.println("PLease Enter Value 3 : ");
	    value3 = keyboard.nextDouble();
	    
	    System.out.println("PLease Enter Value 4 : ");
	    value4 = keyboard.nextDouble();
	    
	    System.out.println("What is your Choice From ( +, -, *, /)");
	    choice = keyboard.next();
		
	} 
	
	public static double calculation() {
		double total = 0;
		
		 if(choice.equals("+")) {
		    	total = value1 + value2+ value3 + value4;
		    	System.out.println("Your total is " + total);
		    }else if(choice.equals("-")) {
		    	total = value1 - value2;
		    	System.out.println("Your total is " + total);
		    }else if(choice.equals("*")) {
		    	total = value1 * value2;
		    	System.out.println("Your total is " + total);
		    }else if(choice.equals("/")) {
		    	total = value1 / value2;
		    	System.out.println("Your total is " + total);
		    }
		    else {
		    	System.out.println("You chose Wrong Charecter");
		    }
		 
		 return total;
	}
	
	
	public static void average() {
		
		double total = calculation();
		
		double average = total/4;
		
		System.out.println("Your average is " + average);
		
	}

}
