import java.util.ArrayList;
import java.util.Scanner;

//Hello
public class Main {

     public static void main(String[] args) {
    	 System.out.println("Input a number inbetween 1 and 100 to get their factors, if you are finished you may type 'QUIT' to exit the program.");
          Scanner c = new Scanner(System.in);
          boolean quit = false;
          while(quit == false){
        	  System.out.print("Input: ");
        	  String in = c.next();
        	  if(in.equals("QUIT")){
        		  quit = true;
        		  System.out.println("Thank you.");
        	  } else {
        		  int input;
        		  try {
        			  input = Integer.parseInt(in);
        			  if(input <= 100 && input >= 1){
        				  System.out.print("Factors: ");
            	          ArrayList<Integer> listOfFactors = factors(input);
            	          for(int j = 0; j < listOfFactors.size(); j++){
            	        	  System.out.print(listOfFactors.get(j) + " ");
            	          }
        	        	  System.out.println();
        			  } else {
        				  System.out.println("The number you input is not inbetween 1 and 100.");
        			  }
        		  } catch(NumberFormatException e) {
        			  System.out.println("Only input numbers please.");
        		  }
        	  }
          }
     }
     
     public static ArrayList<Integer> factors(int num){
    	 ArrayList<Integer> factors = new ArrayList<Integer>();
    	 for(int i = 1; i <= num; i++){
    		 for(int k = 1; k <= num; k++){
    			 if(i * k == num){
    				 factors.add(i);
    			 }
    		 }
    	 }
    	 return factors;
     }

}