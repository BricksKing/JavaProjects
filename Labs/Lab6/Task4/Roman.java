public class Roman {
  // datavalues

  private String romanNumeral;
  private int decimalNum;

  // constructors

  public Roman(String rString) {
    romanNumeral = rString;

    romanToDecimal();
  }

  //print num method
  
  public void printRomanNum() {
    System.out.println(romanNumeral);
  }

  public void printDecimalNum() {
    System.out.println(decimalNum);
  }

  // setroman method
  public void setRoman(String rString) {
    this.romanNumeral = rString;
    romanToDecimal();
  }

  // set decimal num from roman num

  public void romanToDecimal() {
    int sum = 0;
    int prev = 1000;

    for (int i = 0; i < romanNumeral.length(); i++) {
      switch (romanNumeral.charAt(i)) {
        case 'M':
          sum += 1000;
          if (prev < 1000) {
            sum = sum - 2 * prev;
          }
          prev = 1000;
          break;

        case 'D':
          sum += 500;
          if (prev < 500) {
            sum = sum - 2 * prev;
          }
          prev = 500;
          break;

        case 'C':
          sum += 100;
          if (prev < 100) {
            sum = sum - 2 * prev;
          }
          prev = 100;
          break;

        case 'L':
          sum += 50;
          if (prev < 50) {
            sum = sum - 2 * prev;
          }
          prev = 50;
          break;

        case 'X':
          sum += 10;
          if (prev < 10) {
            sum = sum - 2 * prev;
          }
          prev = 10;
          break;
        case 'V':
          sum += 5;
          if (prev < 5) {
            sum = sum - 2 * prev;
          }
          prev = 5;
          break;
        case 'I':
          sum += 1;
          prev = 1;
          break;

      }
    }
    decimalNum = sum;
  }
}
