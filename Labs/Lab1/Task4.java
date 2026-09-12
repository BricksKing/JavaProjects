import java.util.Scanner;
import java.lang.Math;

public class Task4 {
  public static void main(String[] args) {
    // Declare variables
    double amountofMilk, totalCost, totalProfit;
    int milkCarton;

    final double maxliterCarton = 3.78;
    final double costPerLiter = 0.38;
    final double profitPerCarton = 0.27;

    // prompt user amount of milk
    System.out.println("Enter the amount of milk produced in liters:");
    Scanner input = new Scanner(System.in);

    amountofMilk = input.nextDouble();
    input.close();

    // Calculate amount of cartons produced
    milkCarton = (int) Math.round(amountofMilk / maxliterCarton);

    // Calculate cost per liter
    totalCost = amountofMilk * costPerLiter;

    // Calculate profit per carton
    totalProfit = milkCarton * profitPerCarton;

    // output results
    System.out.println("Milk cartons needed: " + milkCarton + "\nCost per liter: $" + totalCost
        + "\nProfit per carton: $" + totalProfit);
  }
}
