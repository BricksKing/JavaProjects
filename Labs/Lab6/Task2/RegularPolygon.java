import java.lang.Math;

public class RegularPolygon {
  // private data entries
  private int n = 3;
  private double side = 1;
  private double x = 0;
  private double y = 0;

  // no args, use defaults
  public RegularPolygon() {
  }

  // n and side args
  public RegularPolygon(int n, double side) {
    this.n = n;
    this.side = side;
  }

  public RegularPolygon(int n, double side, double x, double y) {
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
  }

  //Accessors and mutators methods
  public int getN() {
    return this.n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public double getSide() {
    return this.side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getX() {
    return this.x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return this.y;
  }

  public void setY(double y) {
    this.y = y;
  }


  //Methods for perimeter and area of a regular polygon
  public double getPerimeter() {
    return n*side;
  }

  public double getArea() {
    return ((n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n)));
  }
}
