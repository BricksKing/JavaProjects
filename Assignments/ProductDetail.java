import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class ProductDetail {
  public static void main(String[] args) {
    // Declare variables
    int quantity;
    double price, sum = 0;
    int sumofProduct = 0;
    boolean isDiscount = false;
    FileInputStream input_file = null;
    // Try opening the file
    try {
      input_file = new FileInputStream("products.txt");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Error finding the file.");
      System.exit(1);
    }
    // Read the data from the file
    Scanner file_scanner = new Scanner(input_file);
    // Go line by line in the data to get the data

    System.out.printf("%-6s%-8s\n", "Price", "Quantity");

    while (file_scanner.hasNext()) {
      price = file_scanner.nextDouble();
      quantity = file_scanner.nextInt();
      System.out.printf("%-6s%-8s\n", price, quantity);
      sumofProduct += quantity;
      sum += price;
    }
    //Close the scanner
    file_scanner.close();
    // Calculate the total price and determine if a discount should be applied
    if (sumofProduct > 5) {
      isDiscount = true;
    }
    // Output the total price and if discount, output
    System.out.printf("Total price before discount: $%.2f", sum);
    if (isDiscount) {
      double discountedPrice = sum*(1-10.0/100);
      System.out.printf("\nTotal price after discount: $%.2f", discountedPrice);
    }
    else{
      System.out.println("\nNo discount applied.");
    }
  }
}
