import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestCoffee {
  public static void main(String[] args) {
    // Open and read the file
    Scanner input = null;

    try {
      input = new Scanner(new File("coffe_input.txt"));
    } catch (FileNotFoundException e) {
      System.exit(1);
    }

    // Create an array

    CoffeeOrder[] coffeeTable = new CoffeeOrder[8];

    //Fill array with data
    for (int i = 0; i < coffeeTable.length; i++) {
      coffeeTable[i] = new CoffeeOrder(input.next(), input.nextInt(), input.nextDouble(), input.next());
    }

    input.close();

    //Output and get total

    System.out.printf("%-14s %-9s %-10s %-5s\n", "Coffee", "Quantity", "Price/Cup", "Type");
    double sum = 0;

    for (int i = 0; i < coffeeTable.length; i++) {

      System.out.printf("%-14s %-9d $%-10.2f %-5s\n", coffeeTable[i].getCoffee(), coffeeTable[i].getQuantity(), coffeeTable[i].getPrice(), coffeeTable[i].getType());

      sum += coffeeTable[i].getPrice() * coffeeTable[i].getQuantity();
    }

    System.out.printf("Total sales: $%.2f", sum);
  }
}
