import java.util.Scanner;

public class PoundstoKilogram {
  public static void main(String[] args) {
    //Declare variables
    double pounds, kilograms;
    final double converter = 0.4536;

    //prompt user to enter lbs
    System.out.println("Enter the weight in pounds:");
    Scanner input = new Scanner(System.in);

    pounds = input.nextDouble();
    input.close();

    //Convert pounds to kg
    kilograms = pounds * converter;

    //output
    System.out.println(pounds + " lbs is " + kilograms + " kgs.");
  }
}
