import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ProgrammingExercise6 {

  public static void main(String[] args) {
    
    //declare vars
    int[] cars = new int[10];
    int sum = 0;
    int salesPerson = 0;
    int max = 0;

    Scanner inData = null;

    //open the file
    try {
      inData = new Scanner(new File("cars.txt"));
    } catch (FileNotFoundException e) {
      System.out.print("Error Opening the file");
      System.exit(-1);
    }

    //go through the values and add to the sum
    for (int j = 0; j < 10; j++) {
      cars[j] = inData.nextInt();
      sum = sum + cars[j];
    }

    System.out.println("The total number of cars sold = " + sum);

    //find the salesperson who sold the max number of cars
    for (int j = 0; j < 10; j++)
      if (max < cars[j]) {
        max = cars[j];
        //indexes from 0
        salesPerson = j + 1;
      }

    System.out.println("The salesperson selling the maximum number of cars is salesperson " + salesPerson);
    System.out.println("Salesperson " + salesPerson + " sold " + max + " cars last month.");

    inData.close();

  }
}
