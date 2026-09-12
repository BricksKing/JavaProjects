import java.util.Scanner;

public class LetterGrade {
  public static void main(String[] args) {
    // Declare variable
    char grade_letter;
    String grade_message;
    // Prompt user for letter grade
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your letter grade: ");
    // Read the letter grade and assign variable
    grade_letter = input.next().charAt(0);
    // set grade message from letter grade and print output
    switch (grade_letter) {
      case 'A':
        grade_message = "Excellent";
        break;
      case 'B':
        grade_message = "Very Good";
        break;
      case 'C':
        grade_message = "Passing";
        break;
      case 'D':
        grade_message = "Not Good. Go Study";
        break;
      case 'F':
        grade_message = "Not Good. Go study";
        break;
      default:
        grade_message = "That is not a possible grade";
        break;
    }
    System.out.println(grade_message);

  }
}
