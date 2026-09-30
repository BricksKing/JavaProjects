import java.util.Scanner;

public class TestScores {
  public static double avgTesScore(int[] scores, int students) {
    int sum = 0;
    //loop through for sum
    for (int score: scores) {
      sum += score;
    }

    //get average
    double avg = sum / (double)students;

    return avg;

  }

  public static int highScore(int[]scores) {
    int highIndex = 0;
    
    //loop through finding the highest score
    for (int i = 0; i < scores.length; i++) {
      if(highIndex < i) {
        highIndex = i;
      }
    }
    return highIndex;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Get number of students
    System.out.println("Enter the amount of students: ");

    //Declare variables
    int numOfStudents = input.nextInt();

    String[] students = new String[numOfStudents];
    int[] scores = new int[numOfStudents];

    //prompt user for student name and test score
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("Enter student " + (i+1) + "'s name and test score");
      students[i] = input.next();
      scores[i] = input.nextInt();
    }

    input.close();

    //get avg
    double avg = avgTesScore(scores, numOfStudents);

    //get high score
    int highScoreIndex = highScore(scores);
    
    //find lower than avg score students
    System.out.println("\nStudents with test scores below average: ");
    for (int i = 0; i < numOfStudents; i++) {
      
      if (scores[i] < avg) {
        System.out.println(students[i]);
      }
    }

    //Output average test score
    System.out.println("\nAverage test score: " + avg);

    System.out.println("Student with highest score is " + students[highScoreIndex] + " with a score of " + scores[highScoreIndex]);

  }
}
