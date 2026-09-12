import java.lang.Math;
import java.util.*;

public class PrimeNumbers {
  public static void main(String[] args) {
    // Declare variables
    int num;
    boolean isPrime = true;
    int sqrtNum;
    int divisor;
    // Prompt user for positive numbers
    System.out.println("Enter a positive integer greater than 1:");
    Scanner input = new Scanner(System.in);
    // check if valid
    num = input.nextInt();
    input.close();
    if (num < 1) {
      return;
    }
    // special case for 2
    else if (num == 2) {
      System.out.println("It is a prime number");
    }
    // special case for even num not prime
    else if (num % 2 == 0) {
      System.out.println("It is not a prime number");
    }
    // Loop through divisor 3 and sqrt
    else {
      divisor = 3;
      sqrtNum = (int)(Math.pow(num, 0.5)+1);
      while (divisor <= sqrtNum) {
        if (num % divisor == 0) {
          System.out.println("It is not a prime number");
          isPrime = false;
          break;
        }
        else {
          divisor += 2;
        }
      }
      if (isPrime) {
        System.out.println("It is a prime number");
      }
    }
  }
}
