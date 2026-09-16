import java.util.*;
import java.lang.Math;

public class TriangleArea {
  public static boolean isValid(double side1, double side2, double side3) {
    return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
  }

  public static double area(double side1, double side2, double side3) {
    double s = (side1 + side2 + side3)/2.0;
    
    //area formula
    double total = s*(s-side1)*(s-side2)*(s-side3);
    double area = Math.pow(total, 1/2.0);

    return area;
  } 

  public static void main(String[] args) {
    //Declare variables
    double side1;
    double side2;
    double side3;

    //Prompt user to enter sides of a triangle
    System.out.println("Please enter the sides of a triangle:");
    Scanner input = new Scanner(System.in);

    side1 = input.nextDouble();
    side2 = input.nextDouble();
    side3 = input.nextDouble();

    input.close();

    //if valid, output area
    if (isValid(side1, side2, side3)) {
      System.out.println("The area of a triangle is " + area(side1, side2, side3));
    }
    else {
      System.out.println("Invalid triangle.");
    }
  }
}
