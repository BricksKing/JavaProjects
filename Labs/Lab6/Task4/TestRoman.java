import java.util.Scanner;

public class TestRoman {
  public static void main(String[] args) {
    //prompt user for input roman num

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a roman numeral: ");

    //Read roman input
    String r1 = input.next();

    input.close();

    Roman romanNum = new Roman(r1);
    
    System.out.println("The decimal for " + r1 + " is: ");
    romanNum.printDecimalNum();
  }
}
