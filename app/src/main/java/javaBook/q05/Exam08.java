package javaBook.q05;

public class Exam08 {
  public static void main(String[] args) {

    int a = 1, b = 0;

    while(a < 1000) {
      if (a%2 == 0 && a%7 == 0) {
        b += a;      
      }
      a++;
    }
    System.out.println(b);
  }

}
