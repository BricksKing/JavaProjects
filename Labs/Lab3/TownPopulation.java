import java.util.*;

public class TownPopulation {
  public static void main(String[] args) {
    // Declare variables
    int townA, townB;
    double growthRateA, growthRateB;
    // Initialize years
    int years = 0;
    // prompt user for pop and growth rate
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the current population of town A:");
    townA = input.nextInt();

    System.out.println("Enter the current population of town B:");
    townB = input.nextInt();

    System.out.println("Enter the growth rate of town A:");
    growthRateA = input.nextDouble();

    System.out.println("Enter the growth rate of town B:");
    growthRateB = input.nextDouble();

    input.close();
    //Check if town A is greater already
    // do a while loop when townA <= townB and calculate population growth for both
    // towns
    while (townA < townB) {
      townA = (int) (townA * (1 + growthRateA / 100));
      townB = (int) (townB * (1 + growthRateB / 100));
      years++;
    }
    // when while loop breaks, output findings
    System.out.println("After " + years + "year(s), the population of town A will be greater than or equal to town B.");
    System.out.println("After " + years + "year(s), the population of town A will be " + townA);
    System.out.println("After " + years + "year(s), the population of town B will be " + townB);
  }
}
