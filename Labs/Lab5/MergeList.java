import java.util.Scanner;
import java.util.Arrays;


public class MergeList {
  public static int[] merge(int[] array0, int[] array1) {
    int[] result = new int[array0.length + array1.length];

    // basically the i counter but for the 3 arrays
    int[] iterator = new int[3];

    // While there is still numbers
    while (iterator[0] < array0.length && iterator[1] < array1.length) {
      // if array0 is smaller than array 1 than add it to the result and increment the
      // counter
      if (array0[iterator[0]] < array1[iterator[1]]) {
        result[iterator[2]++] = array0[iterator[0]++];
      } else {
        result[iterator[2]++] = array1[iterator[1]++];
      }
      // Add remaining numbers
    }

    while (iterator[0] < array0.length) {
      result[iterator[2]++] = array0[iterator[0]++];
    }
    while (iterator[1] < array1.length) {
      result[iterator[2]++] = array1[iterator[1]++];
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get list1
    System.out.println("Enter the size of list 1 and the numbers to put in the list (first num is the size)");

    int size1 = input.nextInt();

    int[] list1 = new int[size1];
    // get numbers for list 1
    for (int i = 0; i < list1.length; i++) {
      list1[i] = input.nextInt();
    }

    // Get list 2
    System.out.println("Enter the size of list 2 and the numbers to put in the list (first num is the size)");

    int size2 = input.nextInt();

    int[] list2 = new int[size2];
    // get numbers for list 1
    for (int i = 0; i < list2.length; i++) {
      list2[i] = input.nextInt();
    }
    input.close();
    Arrays.sort(list1);
    Arrays.sort(list2);
    // merge both lists
    int[] mergedList = merge(list1, list2);

    // output the arrays
    System.out.println("Array 1: [");
    for (int num : list1) {
      System.out.printf("%d ", num);
    }
    System.out.println("]\n");

    System.out.println("Array 2: [");
    for (int num : list2) {
      System.out.printf("%d ", num);
    }
    System.out.println("]\n");

    System.out.println("Merged Array: [");
    for (int num : mergedList) {
      System.out.printf("%d ", num);
    }
    System.out.println("]\n");

  }
}
