import java.util.Date;

public class Account {
  // set data values
  private int id = 0;
  private double bal = 0;
  private double annualIR = 0; // represents percentage
  private Date dateCreated;

  // constructor
  public Account() {
    dateCreated = new Date();
  }

  public Account(int id, double bal, double annualIR) {
    this(); // if no arg, call this for default vals
    this.id = id;
    this.bal = bal;
    this.annualIR = annualIR;

  }

  // Methods
  // Accessors
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBal() {
    return this.bal;
  }

  public void setBal(double bal) {
    this.bal = bal;
  }

  public double getannualIR() {
    return this.annualIR;
  }

  public void setannualIR(double annualIR) {
    this.annualIR = annualIR;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  // Monthly interests
  public double getMonthlyInterestRate() {
    return annualIR / 12.0;
  }

  public double getMonthlyInterest() {
    return bal * (getMonthlyInterestRate() / 100);
  }

  // withdrawl and deposit methods
  public void withdraw(double val) {
    // check if enough funds
    if (bal > val) {
      bal -= val;
    }
    else {
      System.out.println("Insufficient funds");
    }
  }

  public void deposit(double val) {
    if(val >= 0) {
      bal += val;
    }
    else {
      System.out.println("Number must be positive.");
    }

  }
}
