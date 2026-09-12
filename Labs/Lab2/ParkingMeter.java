import java.util.Scanner;

public class ParkingMeter {
  public static void main(String[] args) {
    //Declare variables
    double hours, parkingFee;
    //prompt user how many hours stayed
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of hours the car was parked: ");

    hours = input.nextDouble();
    input.close();
    //calculate the parking fee based on hours
    if (hours <= 3) {
      parkingFee = 5;
    }
    else if (hours > 3 && hours <= 9) {
      parkingFee = 6 * ((int)hours + 1);
    }
    else {
      parkingFee = 60;
    }
    //output the cose
    System.out.printf("Please pay: $%.2f", parkingFee);
  }
}
