// NOTE! This kata can be more difficult than regular 8-kyu katas (lets say 7 or 6 kyu)
// Complete the function which get an input number n such that n >= 10 and n < 10000, then:

// Sum all the digits of n.
// Subtract the sum from n, and it is your new n.
// If the new n is in the list below return the associated fruit, otherwise return back to task 1.

// .
// .
// .
// ...until you find the first n in the list below.

// There is no preloaded code to help you. This is not about coding skills; think before you code

// My solution 
import java.util.*;

public class Kata {
  public static String subtractSum (int n) { // method to subtract new sum from inital n value 
    //return fruit name like "apple"
    addInput subtract= new addInput();
    // need to take values from add input and create method to subract the original n by n2
    
    
  }
  public int addInput { // method to add the indexes of the user input 
    int sum= 0;
    int digit;
    System.out.println("Please enter a number greater than or equal to 10 and less than 10000: ");
    Scanner input = new Scanner(System.out);
    int n = input.nextInt();
    int n2= n;
    if (n2>=10||n2<10000){
      digit= n2%10;
      sum= sum + digit;
      n2=n2/10;
      
  }
    else{
      System.out.println("Number entered is invalid. Please try again.");
    }
    
    }
  public static void main (String[] args){ // main method 
    
  }
}