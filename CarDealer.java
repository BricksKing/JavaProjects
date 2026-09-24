public class CarDealer {
  public static void main(String[] args) {
    //Declare Variables
    int[][] cars = {{3,4,0,8}, {5,6,2,1}, {7,3,2,7}, {6,2,4,3}, {5,0,2,1}};
    int sum = 0;
    //use for loop to get total number of cars
    for(int i = 0; i < cars.length;i++) {
      for(int j = 0; j < cars[i].length; j++) {
        sum += cars[i][j];
      }
    }
    //output the number
    System.out.println("There are a total of " + sum + " cars");
  }
}
