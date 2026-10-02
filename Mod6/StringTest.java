import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringTest {
  public static void main(String[] args) {
    //read file
    Scanner input = null;
    try {
      input = new Scanner(new File("input.txt"));
    } catch (FileNotFoundException e) {
      System.exit(1);
    }

    String s = new String(input.nextLine());

    input.close();

    //Replace with regex

    s = s.replaceAll("[#$+]", " ");

    //output

    System.out.println(s);

    System.out.println(s.toUpperCase());
  }
}
