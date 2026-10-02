import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {

  // private data values
  private int year;
  private int month;
  private int day;

  // constructors
  MyDate() {
    GregorianCalendar date = new GregorianCalendar();
    year = date.get(Calendar.YEAR);
    month = date.get(Calendar.MONTH);
    day = date.get(Calendar.DAY_OF_MONTH);
  }

  MyDate(long elapsedTime) {
    GregorianCalendar date = new GregorianCalendar();
    date.setTimeInMillis(elapsedTime);
    year = date.get(Calendar.YEAR);
    month = date.get(Calendar.MONTH);
    day = date.get(Calendar.DAY_OF_MONTH);
  }

  MyDate(int year, int month, int day) {
    this();
    this.year = year;
    this.month = month;
    this.day = day;
  }

  // accessors and mutators
  public int getYear() {
    return this.year;
  }

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  public void setYear(int val) {
    this.year = val;
  }

  public void setMonth(int val) {
    this.month = val;
  }

  public void setDay(int val) {
    this.day = val;
  }
}
