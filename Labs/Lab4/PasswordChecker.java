import java.util.*;

public class PasswordChecker {
  public static boolean validPassword(String p) {
    int count = p.length();
    //Check if password is 8 characters long
    if (count <= 8) {
      System.out.println("Password has to be at least 8 characters long.");
      return false;
    }
    //Check string only has
    for (int i = 0; i < p.length(); i++) {
      if (!Character.isLetterOrDigit(p.charAt(i))) {
        System.out.println("Password can only contain letters and digits.");
        return false;
      }
    }
    // count digits ensure greater than or equal to 2
    int digit_count = 0;
    for (int i = 0; i < p.length(); i++ ) {
      if (Character.isDigit(p.charAt(i))) {
        digit_count++;
      }
    }
    if (digit_count < 2) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    //Declare variable
    String password;

    //Prompt user for password
    System.out.println("Please enter a password:");
    Scanner input = new Scanner(System.in);

    password = input.nextLine();

    input.close();

    //Check if valid
    boolean isValid = validPassword(password);

    if (isValid) {
      System.out.println("Password successful!");
    }
  }
}
