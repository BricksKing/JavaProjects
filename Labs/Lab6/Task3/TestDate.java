public class TestDate {
  public static void main(String[] args) {
    MyDate d1 = new MyDate();
    MyDate d2 = new MyDate(34355555133101L);

    MyDate[] table = {d1, d2};

    for(int i = 0; i < table.length; i++) {
      System.out.println("year: " + table[i].getYear());
      System.out.println("month: " + table[i].getMonth());
      System.out.println("day: " + table[i].getDay());
    }
  }
}
