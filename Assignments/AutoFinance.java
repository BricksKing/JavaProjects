import java.util.Scanner;

public class AutoFinance {
  public static void main(String[] args) {
    // Declare variables
    final double costPerGallon = 2.75, oilChange = 50, upkeep = 400, parkingPass = 306;
    String carBrand, carModel, carYear;
    double carCost, loanDownPayment, yearlyIR, loanTerm, carMPG, carYMU;
    // prompt user for variables
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the car brand: ");
    carBrand = input.nextLine();

    System.out.println("Enter the car model: ");
    carModel = input.nextLine();

    System.out.println("Enter the car year: ");
    carYear = input.nextLine();

    System.out.println("Enter the car cost: ");
    carCost = input.nextDouble();

    System.out.println("Enter the down payment: ");
    loanDownPayment = input.nextDouble();

    System.out.println("Enter the yearly interest rate: ");
    yearlyIR = input.nextDouble();

    System.out.println("Enter the term of the loan in months: ");
    loanTerm = input.nextDouble();

    System.out.println("Enter the car MPG: ");
    carMPG = input.nextDouble();

    System.out.println("Enter the mileage used per year: ");
    carYMU = input.nextDouble();

    input.close();
    // calculate the cost
    double principle = carCost - loanDownPayment;
    double yearlyGas = (carYMU / carMPG) * costPerGallon;
    double monthlyIR = (yearlyIR / 100) / 12;
    double monthlyLoanPayment = (carCost - loanDownPayment) * (monthlyIR * Math.pow((1 + monthlyIR), loanTerm))
        / (Math.pow((1 + monthlyIR), loanTerm) - 1);
    double annualCost = yearlyGas + parkingPass + oilChange * 4 + upkeep + monthlyLoanPayment * 12;
    double monthlyCost = annualCost / 12;
    // output
    System.out.printf("---\nCar Name: " + carYear + " " + carBrand + " " + carModel
        + "\nPrinciple: $%.2f\nInterest Rate: %.2f%%\nLoan term: " + (int) loanTerm
        + "\nMonthly loan Payment: $%.2f\nYearly fuel cost: $%.2f\nAnnual maintanence cost: $%.2f\nAnnual oil cost: $%.2f\nAnnual parking pass: $%.2f\nTotal annual cost: $%.2f\nTotal monthly cost: $%.2f\n---",
        principle, yearlyIR, monthlyLoanPayment, yearlyGas, upkeep, oilChange * 12, parkingPass, annualCost,
        monthlyCost);
  }
}
