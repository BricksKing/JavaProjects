import java.util.Scanner;
import java.lang.Math;

public class Task2 {
  public static void main(String[] args) {
    // Variables
    double x1, y1, x2, y2;

    // Prompt user to set the variable's numbers
    System.out.println("Set the values for x1, y1, x2, y2:");
    Scanner input = new Scanner(System.in);

    // Collect input
    x1 = input.nextDouble();
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();

    // Reject any input after y2
    input.close();

    // Use the distance formula
    double side1 = Math.pow(x2 - x1, 2);
    double side2 = Math.pow(y2 - y1, 2);

    // Get distance
    double distance = Math.sqrt(side1 + side2);

    // output
    System.out.println("Distance: " + distance);

  }
}
