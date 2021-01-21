package myselfproject;

import java.sql.Date;

public class ScannerInput {

  static String StringInput(String text) {

    System.out.println(text);

    return mypj.keyScan.nextLine();
  }

  static int IntInput(String text) {
    System.out.println(text);
    System.out.println();

    return mypj.keyScan.nextInt();
  }

  static Date DateInput(String text) {

    System.out.println(text);

    return Date.valueOf(mypj.keyScan.nextLine());

  }
}