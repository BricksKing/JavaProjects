import java.util.Scanner;

public class SummingEvenOdd {
  public static int sumOdd(int integer) {
    int sum = 0;
    //extract num
    while (integer > 0) {
      int digit = integer % 10;
      //if odd than add to sum
      if (digit % 2 == 1) {
        sum += digit;
      }
      integer = integer / 10;
    }
    return sum;
  }

  public static int sumEven(int integer) {
    int sum = 0;
    //extract numbers
    while (integer > 0) {
      int digit = integer % 10;
      //if even then add to sum
      if (digit % 2 == 0) {
        sum += digit;
      }
      integer = integer / 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    int integer;

    System.out.println("Please enter an integer:");
    Scanner input = new Scanner(System.in);

    integer = input.nextInt();

    input.close();

    if (integer > 0) {
      System.out.println("Integer: " + integer + "\nSum of even numbers: " + sumEven(integer) + "\nSum of odd numbers: " + sumOdd(integer));
    }
    else {
      System.out.println("Please enter a positive number.");
    }
  }

}
