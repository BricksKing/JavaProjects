import java.util.*;

public class SumDigits {
  public static void main(String[] args) {
    // Declare variables
    String num;
    int sum = 0;
    // Prompt user for int
    System.out.println("Please enter an integer: ");
    // Read num as a string
    Scanner input = new Scanner(System.in);
    num = input.next();
    input.close();
    // Loop through character
    for(int i=0;i < num.length(); i++ ) {

    
    // Check if character is digit
      if (Character.isDigit(num.charAt(i))) {

      
    // If so, print character
      System.out.println(num.charAt(i));
      System.out.println(" ");
    // Add value to the sum
      sum += Character.getNumericValue(num.charAt(i));
      }
    }
    // Print output
    System.out.println();
    System.out.printf("The sum of digits is %d", sum);
  }
}
