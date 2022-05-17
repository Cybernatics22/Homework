import java.util.Scanner;

public class Calculator {
	
public static void main( String[] args){
    
    double value1;
    double value2;
   
   Scanner keyboard = new Scanner(System.in); 
   
    System.out.println("Please Enter Value 1 : ");
    value1= keyboard.nextDouble();
    
//    System.out.println(value1);
    
    System.out.println("PLease Enter Value 2 : ");
    value2 = keyboard.nextDouble();
    while(value2 < 0) {
    	System.out.println("Please Choose a positive value");
    	value2 = keyboard.nextDouble();
    }
    
//    
    double total ;
    
//    System.out.println("My Total is " + total);
    
    System.out.println("What is your Choice From ( +, -, *, /)");
    String choice = keyboard.next();
//    while(choice) {
//    	
//    	
//    }
    
    if(choice.equals("+")) {
    	total = value1 + value2;
    	System.out.println("Your total is " + total);
    }else if(choice.equals("-")) {
    	total = value1 - value2;
    	System.out.println("Your total is " + total);
    }
    else {
    	System.out.println("You chose Wrong Charecter");
    }
    
    
//    if(choice.equalsIgnoreCase("+")) {
//    	total = value1 + value2;
//    	System.out.println("You Choose "+ choice+ " ..So Your Results is "+ total);
//    }else if(choice.equalsIgnoreCase("+")) {
//    
//    }else {
//    	System.out.println("You choose Wrong Symbole");
//    }
//    double value1;
//    System.out.println("Please Enter Value 1 : ");
//     value1= keyboard.nextDouble();
//    if(value1 > 100 || value1 <0){
//        System.out.println("You chose a Value Grater than 100.Please Enter a Value Between 1 and 100 : ");
//         value1= keyboard.nextDouble();
//    }
//    
//    System.out.println(value1);
//   
//     
} 
}