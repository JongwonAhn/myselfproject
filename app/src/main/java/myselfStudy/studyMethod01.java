package myselfStudy;

import java.util.Scanner;

public class studyMethod01 {


  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    System.out.println("금액 입력");

    System.out.println(give(keyScan.nextInt()));   


    keyScan.close();
  }

  public static int give(int basic) {

    System.out.println(basic);
    //int basic;

    //basic = keyScan.nextInt();



    return back(basic);
  }

  public static int back(int interest) {

    interest = interest * 2;

    return interest;




  }

}
