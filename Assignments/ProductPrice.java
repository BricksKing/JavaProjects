import java.util.*;

public class ProductPrice {
  public static void main(String[] args) {
    // Declare variables
    int numOfItems;
    double total = 0;
    double price;
    boolean isDiscount = false;
    // Prompt the user the number of products being bought
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of products:");
    //read input
    numOfItems = input.nextInt();
    // Check if discount is included
    if (numOfItems > 5) {
      isDiscount = true;
    }
    // Using that number, loop the function x amount of times, asking the user the
    for (int i = 1; i <= numOfItems; i++) {
      System.out.printf("Enter the price of product %d:", i);
    // price of the product
      price = input.nextDouble();
    // Add the price to the sum
      total += price; 
    }
    System.out.printf("\nYour total is $%.2f before a discount is applied.\n", total);
    // If there is a discount, make it 10% off
    if (isDiscount) {
      total = (total*(1-10.0/100));
      System.out.println("A 10% discount was applied!\n");
    }
    else {
      System.out.println("No discount was applied.\n");
    }
    // Once finished, output the sum and items
    System.out.printf("You bought " + numOfItems + " products. Your total is $%.2f", total);
  }
}
