package myselfStudy.study01;

import java.sql.Date;
import java.util.Scanner;

public class study02 {
  static Scanner keyScan = new Scanner(System.in);
  public static class Member{

    int a;
    String b;
    Date c;

    public String info() {
      this.a=40;
      this.b="김";
      this.c= new java.sql.Date(System.currentTimeMillis());

      return a+b+c;
    }

    public Member add(int a,String b) {
      return this;

    }
  }

  public static void main(String[] args) {

    int LENGTH = 100;

    Member[] Members = new Member[LENGTH];

    Members[0]=new Member();

    Member member = new Member();

    Members[0]=member;

    member.a = 20;
    member.b = "ga";
    member.c = new java.sql.Date(System.currentTimeMillis());


    System.out.println( member.info());

  }
}


