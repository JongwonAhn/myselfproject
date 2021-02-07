package myproject.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
  static Scanner keyScan = new Scanner(System.in);


  public  String inputString(String title) {
    System.out.println(title);
    return keyScan.nextLine();  
  }

  public  int inputInt(String title) {
    return Integer.parseInt(inputString(title));

  }

  public  Date inputDate(String title) {
    return Date.valueOf(inputString(title));
  }

  public void close() {
    keyScan.close();
  }

}
