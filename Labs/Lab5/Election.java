import java.util.Scanner;

public class Election {
  public static int totalVotes(int[] votes) {
    int sum = 0;
    // loop to get sum
    for (int i = 0; i < 5; i++) {
      sum += votes[i];
    }
    return sum;
  }

  public static int getWinner(int[] votes) {
    int winnerIndex = 0;

    for (int i = 0; i < 5; i++) {
      // find the winner by checking who has largest vote
      if (votes[winnerIndex] < votes[i]) {
        winnerIndex = i;
      }
    }
    return winnerIndex;
  }

  public static void main(String[] args) {
    // Declare variable arrays
    String[] candidates = new String[5];
    int[] votes = new int[5];

    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      // prompt user for name and vote
      System.out.println("Enter candidate " + i + "'s name and number of votes");
      candidates[i] = input.next();
      votes[i] = input.nextInt();

    }

    input.close();

    // calc total vote
    int totalVotes = totalVotes(votes);

    System.out.printf("\n%-20s %-20s %-5s", "Candidate", "Number of votes", "Percentage of votes");
    for (int i = 0; i < 5; i++) {

      //output results
      double percentVotes = (((double) votes[i] / (double) totalVotes) * 100);

      System.out.printf("\n%-20s %-20d %-5.2f", candidates[i], votes[i], percentVotes);

    }

    //output winner
    int winner = getWinner(votes);

    System.out.println("\nTotal votes is: " + totalVotes);
    System.out.println("The winner of the election is: " + candidates[winner]);

  }

}
