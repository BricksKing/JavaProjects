public class Sport {
  // data fields
  private String sportName = "None";
  private String teamName = "None";
  private int players = 0;
  private double coachSalary = 0;

  public Sport() {
  };

  public Sport(String sport, String team, int players, double salary) {
    this();
    this.sportName = sport;
    this.teamName = team;
    this.players = players;
    this.coachSalary = salary;
  }

  // accessors and mutators
  public String getSportName() {
    return sportName;
  }

  public String getTeamName() {
    return teamName;
  }

  public int getPlayers() {
    return players;
  }

  public double getCoachSalary() {
    return coachSalary;
  }

  public void setSportName(String sportName) {
    this.sportName = sportName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public void setPlayers(int players) {
    this.players = players;
  }

  public void setCoachSalary(double coachSalary) {
    this.coachSalary = coachSalary;
  }
}
