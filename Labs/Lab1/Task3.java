import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    // Declare variables
    double score1, score2, score3, score4;

    // Prompt user to enter the scores
    System.out.println("Enter the test scores:");
    Scanner input = new Scanner(System.in);

    // collect input
    score1 = input.nextDouble();
    score2 = input.nextDouble();
    score3 = input.nextDouble();
    score4 = input.nextDouble();

    input.close();
    
    //calculate the average
    double average = (score1 + score2 + score3 + score4) / 4;

    //output
    System.out.println("Average test score: " + average);
  }
}
