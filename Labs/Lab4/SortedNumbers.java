import java.util.Scanner;

public class SortedNumbers {
  public static void displaySortedNumbers(double num1, double num2, double num3) {
    //add temp when swapping numbers
    double temp;

    //swap numbers
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }
    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }
    //check again if number 1 is greater than number 2
    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }

    System.out.printf("The sorted numbers are %f, %f, %f\n", num1, num2, num3);
    
  }

  public static void main(String[] args) {
    //Declare variables
    double num1;
    double num2;
    double num3;

    // prompt user to input the numbers
    System.out.println("Please enter 3 numbers");
    Scanner input = new Scanner(System.in);

    num1 = input.nextDouble();
    num2 = input.nextDouble();
    num3 = input.nextDouble();

    input.close();

    displaySortedNumbers(num1, num2, num3);
  }
}
