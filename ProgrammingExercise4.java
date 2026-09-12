public class ProgrammingExercise4 {
  public static void main(String[] args) {
    //initialization declared at variable
    int i = 0;
    int value = 3;
    //while loop condition
    while (i < 5) {
      value = value * (i + 1) + i;
      //increment the i variable
      i++;
    }
    System.out.print("Value = " + value);
  }
}
