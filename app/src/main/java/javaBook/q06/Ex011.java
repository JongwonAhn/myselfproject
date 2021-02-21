package javaBook.q06;

public class Ex011 {

  public static void main(String[] args) {

    add(5,3);
    minus(5,3);
    multi(5,3);
    divi(5,3);

  }

  public static void add(int a, int b) {

    System.out.println(a+b);  
  }

  public static void minus(int a, int b) {

    System.out.println(a - b);
  }

  public static void multi(int a, int b) {

    System.out.println(a*b);
  }

  public static void divi(int a, int b) {

    int c = a / b;
    int d = a % b;
    System.out.printf("목: %d, 나머지:%d",c, d);
  }

}
