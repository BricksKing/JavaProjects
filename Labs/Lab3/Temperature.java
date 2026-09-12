import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) {
    // Declare variables
    int temp;
    int day = 1;
    int minTemp;
    int dayMinTemp;
    int sum = 0;
    // Open input file
    FileInputStream input_file = null;
    try {
      input_file = new FileInputStream("input.txt");
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Scanner file_scanner = new Scanner(input_file);
    // Read 1st temp
    temp = file_scanner.nextInt();
    // Set min value to first day temp
    minTemp = temp;
    dayMinTemp = day;
    // Set sum of first temp
    sum += temp;
    // print first day
    System.out.printf("%-10s%-4s%-13s\n", "Month", "Day", "Temperature");
    System.out.printf("%-10s%-4d%-13s\n", "January", day, temp);
    // Loop through rest of january
    for (day = 2; day <= 31; day++) {
      temp = file_scanner.nextInt();
      sum += temp;

      System.out.printf("%-10s%-4d%-13s\n", "January", day, temp);
      if (temp < minTemp) {
        minTemp = temp;
        dayMinTemp = day;
      }
    }
    file_scanner.close();
    // output
    System.out.printf("The average temperature was: %.2f\n", (double)sum/31);
    System.out.printf("The lowest temperature in January was: %d\n", minTemp);
    System.out.printf("The lowest temperature was on January %d", dayMinTemp);

  }
}
