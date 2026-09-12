import java.util.Scanner;

public class SpeedDistance {
  public static void main(String[] args) {
    // Variables
    double speedKmH, distanceKm, speedMph, time;
    final double kmhTomph = 0.621671;

    // Prompt user for speed in kmh
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the speed in Km/H:");

    speedKmH = input.nextDouble();

    // Prompt user for distance in km
    System.out.println("Enter the distance traveled in km:");

    distanceKm = input.nextDouble();

    input.close();

    // Convert Km/H to Mph
    speedMph = speedKmH * kmhTomph;

    // Calculate time traveled from distance and speed
    time = distanceKm / speedKmH;

    // print results
    System.out.printf("Speed in miles per hour is %4.2f", speedMph);
    System.out.println("\nDistance traveled is " + distanceKm + " Km in " + time + " hours");
  }
}
