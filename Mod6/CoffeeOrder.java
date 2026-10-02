public class CoffeeOrder {
  // Data fields
  private String coffee = "None";
  private int quantity = 0;
  private double pricePerCup = 0.00;
  private String type = "N/A";

  public CoffeeOrder() {}

  public CoffeeOrder(String coffee, int quantity, double price, String type) {
    this.coffee = coffee;
    this.quantity = quantity;
    this.pricePerCup = price;
    this.type = type;
  }

  // accessors and mutators
  public String getCoffee() {
    return this.coffee;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double getPrice() {
    return this.pricePerCup;
  }

  public String getType() {
    return this.type;
  }

  public void setCoffee(String coffee) {
    this.coffee = coffee;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setPrice(double price) {
    this.pricePerCup = price;
  }

  public void setType(String type) {
    this.type = type;
  }
}
