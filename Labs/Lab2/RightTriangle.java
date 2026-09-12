import java.util.Scanner;

public class RightTriangle {
  public static void main(String[] args) {
    //Declare variables
    int SideA, SideB, SideC;
    //Recieve input for right triangle
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the lengths of the sides a triangle:");
    SideA = input.nextInt();
    SideB = input.nextInt();
    SideC = input.nextInt();
    input.close();
    //Determine right triangle using if statement
    if ((SideA * SideA + SideB * SideB) == (SideC * SideC) || (SideB * SideB + SideC * SideC) == (SideA * SideA) || (SideA * SideA + SideC * SideC) == SideB * SideB) {
      System.out.println("This is a right triangle");
    }
    else {
      System.out.println("This is not a right triangle");
    }
  }
}
