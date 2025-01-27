package nz.ac.auckland.se281;

public class Date {

  // Variables for the Date class
  private int day;
  private int month;
  private int year;

  // Constructor for the Date class
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // Getter methods for the values
  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  // Method to compare if a date is after another
  public boolean isAfter(Date other) {
    // Check if date is after other date
    if (this.year > other.getYear()) { // check if year is greater than other year
      return true;
    } else if (this.year == other.getYear()) {
      if (this.month > other.getMonth()) { // check if month is greater than other month
        return true;
      } else if (this.month == other.getMonth()) {
        if (this.day > other.getDay()) { // check if day is greater than other day
          return true;
        }
      }
    }
    return false; // return false if date is not after other date.
  }

  // Method to compare if a date is the same as another
  public boolean isSame(Date other) {
    return this.year == other.getYear()
        && this.month == other.getMonth()
        && this.day == other.getDay();
  }

  // method to return date as a string in format dd/mm/yyyy
  @Override
  public String toString() {
    // check if day is less than 10 and add 0 if true
    if (day < 10 && month >= 10) {
      return "0" + day + "/" + month + "/" + year;
    } else if (day >= 10 && month < 10) { // check if month is less than 10 and add 0 if true
      return day + "/0" + month + "/" + year;
    } else if (day < 10
        && month < 10) { // check if day and month are less than 10 and add 0 if true
      return "0" + day + "/0" + month + "/" + year;
    } else {
      return day + "/" + month + "/" + year;
    }
  }
}
