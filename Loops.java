import java.util.*;

public class Loops {
  public static void main(String[] args) {
    // Declare variables
    Scanner input = new Scanner(System.in);
    int total = 0;
    int number;
    // prompt user to input numbers
    System.out.print("Enter the numbers to be added and end with -1: ");
    number = input.nextInt();
    // loop until sentinel, the loop breaks when -1 is entered and thus will not be added to the total
    while (number != -1) {
      total += number;
      number = input.nextInt();

    }

    System.out.print("Total = " + total);
    input.close();
  }
}
