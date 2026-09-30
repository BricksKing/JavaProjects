import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class MonthTemperature {
  public static int lowestTemp(int[] temp) {
    int month = 0;
    //find lowest temp
    for (int i = 0; i < temp.length; i++) {
      if(temp[i] < temp[month]) {
        month = i;
      }
    }
    return month;
  }

  public static void main(String[] args) {
    Scanner input_file = null;

    //read file
    try {
      input_file = new Scanner(new File("temperature.txt"));
    } catch (FileNotFoundException e) {
      System.exit(1);
    }
    
    //declare arrays
    String[] month = new String[12];
    int[] temp = new int[month.length];

    for (int i = 0; i < month.length; i++) {
      month[i] = input_file.next();
      temp[i] = input_file.nextInt();

      System.out.printf("%-20s %-5d\n", month[i], temp[i]);
    }

    //Find lowest temp
    int minTemp = lowestTemp(temp);

    System.out.println("The month with the lowest temperature is " + month[minTemp] + " with a temperature of " + temp[minTemp] + " degrees.");

  }
}
