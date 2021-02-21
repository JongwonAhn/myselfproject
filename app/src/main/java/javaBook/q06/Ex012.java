package javaBook.q06;

public class Ex012 {

  public static void main(String[] args) {

    abs(4,2);
    abs(2,4);
  }

  public static void abs(int a, int b) {

    if(a > b) {
      System.out.println(a-b);
    }else {
      System.out.println(b-a);
    }

  }



}
