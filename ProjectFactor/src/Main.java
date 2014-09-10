import java.util.ArrayList;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
    	 System.out.println("Input a number inbetween 1 and 100 to get their factors, if you are finished you may type 'QUIT' to exit the program.");
    	 Scanner c = new Scanner(System.in);
         boolean quit = false;
          while(quit == false){
        	  System.out.print("Input: ");
        	  String in = c.nextLine();
        	  if(in.equals("QUIT")){
        		  quit = true;
        		  System.out.println("Thank you.");
        	  } else {
        		  try {
        			  Scanner readLine = new Scanner(in);
        			  int first = Integer.parseInt(readLine.next());
        			  ArrayList<Integer> inputList = new ArrayList<Integer>();
        			  inputList.add(first);
        			  while(readLine.hasNext()){
        				  inputList.add(Integer.parseInt(readLine.next()));
        			  }
        			  if(inputList.size() == 1){
        				  int input = 0;// = inputList.get(0))
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
     
     public static int getGCD(ArrayList<Integer> nums){
    	 int smallest = nums.get(0);
    	 for(int i = 1; i < nums.size(); i++){
        	 if(nums.get(i) < smallest){
        		 smallest = nums.get(i);
        	 }
    	 }
    	 boolean[] numsTest = new boolean[nums.size()];
    	 int count = smallest;
    	 while(smallest != 0){
    		 for(int j = 0; j < numsTest.length; j++){
    			 if(nums.get(j)%count == 0){
    				 numsTest[j] = true;
    			 } else {
    				 numsTest[j] = false;
    			 }
    		 }
    		 for(int k = 0; k < numsTest.length; k++){
    			 if( k == numsTest.length - 1 && numsTest[k] == true){
    				 return count; 
    			 } else if (numsTest[k] == false){
    				 count --;
    				 break;
    			 }
    		 }
    	 }
    	 return 1;
     }

}