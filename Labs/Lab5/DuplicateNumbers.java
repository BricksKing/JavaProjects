import java.util.Scanner;

public class DuplicateNumbers {
  public static int[] eliminateDuplicates(int[] numbers) {
    int[] temp = new int[numbers.length];

    int counter = 0;

    for(int i = 0; i < numbers.length; i++) {
      //If the number is not in the temporary array
      if(!is_in_array(temp, numbers[i])) {
        //Add to the array
        temp[counter] = numbers[i];
        //update the counter
        counter++;
      }
    }
    //Copy results
    int[] result = new int[counter];

    for(int i = 0; i < counter; i++){
      result[i] = temp[i];
    }
    
    return result;
  }

  public static boolean is_in_array(int[] temp, int key) {
    //for every number in the temp array
    for(int num:temp) {
      //if the number is already in the array
      if(num == key) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    //Declare array
    int[] numbers = new int[10];

    //prompt user for 10 nums
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 10 numbers");

    for(int i = 0; i < 10; i++) {
      numbers[i] = input.nextInt();
    }

    input.close();

    //remove dupes
    int[] result = eliminateDuplicates(numbers);

    //output results
    System.out.println("The remaining numbers: ");

    for(int num:result){
      System.out.println(num);
    }


  }
}
