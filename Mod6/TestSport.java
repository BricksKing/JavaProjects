import java.util.Scanner;

public class TestSport {
  public static void main(String[] args) {
    //Prompt user for data fields
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the sports name, team name, amount of players, and coach's salary in that order");
    Sport s = new Sport();
    s.setSportName(input.next());
    s.setTeamName(input.next());
    s.setPlayers(input.nextInt());
    s.setCoachSalary(input.nextDouble());

    input.close();

    System.out.println("Sport name: " + s.getSportName() + "\nTeam name: " + s.getTeamName() + "\nNumber of players: " + s.getPlayers() + "\nCoach's salary: " + s.getCoachSalary());

  }
}
