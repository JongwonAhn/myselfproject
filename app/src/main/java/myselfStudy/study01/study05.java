package myselfStudy.study01;

import java.util.Scanner;

public class study05 {

  static void inje(String toy) {
    jong(bank(toy));
  }

  static String bank(String toy ) {

    String doll;
    if(toy.equals("장난감")) {
      doll="인형";
    }
    else {
      doll="박인제가 장난감을 주지않아서 인형도 없습니다.";
    }

    return doll;
  }
  static void jong(String aaaa) {
    System.out.println(aaaa);
  }

  public static void main(String[] args) {

    Scanner KeyScan = new Scanner(System.in);
    while(true) {
      inje(KeyScan.nextLine()); 
    }
  }

}
