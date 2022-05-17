import java.util.Scanner;

public class SalehsHomeWork {
	public static void main(String arg[]) {  
		
		Scanner in = new Scanner(System.in);
//		 double total = 0.00;
//		 double avg= 0.00;
//		System.out.println("Please enter First name ");
//		String  first = k1.nextLine();
//		
//		System.out.println("Please enter Last name ");
//		String  last = k1.nextLine();
//			
//		System.out.println(" Hello"+first+" "+last+" Please enter bangla's Number ");
//		double value1 = k1.nextDouble();
//		System.out.println("Bangla " + value1);
//		while(value1<0 || value1>100) {
//			System.out.println("You enter Wrong value");
//			System.out.println("Please Enter Value1 Again");
//			value1 = k1.nextDouble();
//			
//		}

//		   int value;
//		   int reverse = 0;
//	        Scanner userInput = new Scanner(System.in);
//
//	        
//	            System.out.println("Please enter a  positive value: ");
//	            value = userInput.nextInt();
//	        while (value < 0){
//	            System.out.println(" You entered a wrong input, Please enter a  positive value: ");
//	            value = userInput.nextInt();
//	        }
//	        
//	          for (; value !=0;) {
//	         reverse = reverse * 10;
//	         reverse = reverse + value%10;
//		        value = value/10;
//	          }
//	          System.out.println("Value for reverse "+ reverse);
//	        System.out.println("After Multiply"+reverse);
	        
	       
//	        System.out.println("remainder "+ reverse);
	        
	        
//	        System.out.println(value);
	  
	      

		

		
//	for(int i=1;i<= value;i++) {
//		
//		System.out.println("Hello");
//	}	
//		
		
//		
//		for(int i=1;i<=5;i++) {
//		if (value1<0||value1>100) {
//			System.out.println("wrong input enter bangla's Number again");
//			 value1 = k1.nextDouble();
//		}else {
//			total = total+value1;
//			break;
//		}
//		}
//		
//		System.out.println(" Hello"+first+" "+last+" Please enter English's Number ");
//		
//		double value2 = k1.nextDouble();
//		for(int l=0;l<=5;l++) {
//			if (value2<0||value2>100) {
//				System.out.println("wrong input enter English's Number again");
//				 value2 = k1.nextDouble();
//			}else {
//				total = total+value2;
//				break;
//			}
//			}
//		
//		System.out.println(" Hello"+first+" "+last+" Please entera math's Number ");
//		double value3 = k1.nextDouble();
//		for(int j=0;j<=5;j++) {
//			if (value3<0||value3>100) {
//				System.out.println("wrong input enter Math's Number again");
//				 value3 = k1.nextDouble();
//			}else {
//				total = total+value3;
//				j=6;
//			}
//			}
//		
//		avg = total/3;
//		
//		System.out.println("your avg is "+ avg);
//		
//		
//		if (avg>=90&&avg<=100) {
//			System.out.println("Your grade is A");
//		}else if(avg>=80&&avg<=89) {
//			System.out.println("Your grade is B");
//		}else if(avg>=70&&avg<=79) {
//			System.out.println("Your grade is C");
//		}else if(avg>=60&&avg<=69) {
//			System.out.println("Your grade is D");
//		}else {
//			System.out.println("Your grade is F");
//		}
//		
		
		System.out.println("Please Enter a positive Number");
		int num = in.nextInt();
		
		while(num<0) {
			System.out.println("Please enter a positive Number");
			 num = in.nextInt();
		}
		
		for(int i =1 ; i <=16;i++) {
		double total;
		System.out.println("Value "+i);
		total = num * i;
		
			System.out.println(total);

	}

}
}
