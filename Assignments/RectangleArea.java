import java.util.Scanner;

public class RectangleArea {
  public static void main(String[] args) {
    //Read inputs
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length and the width: "); 
    // Declare variables
    double length = input.nextDouble();
    double width = input.nextDouble();
    // compute area
    double area = length * width;
    // display results
    System.out.println("Area: " + area );
  }
}
