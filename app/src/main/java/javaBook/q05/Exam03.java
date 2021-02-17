package javaBook.q05;

public class Exam03 {
  public static void main(String[] args) {

    int num1 = 50, num2 = 100;
    int a, b;

    if (num1>num2) {
      a = num1;
    }else {
      a = num2;
    }

    if(num1>num2) {
      b = num1 - num2;
    }else {
      b = num2 - num1;
    }
    System.out.println(a);
    System.out.println(b);
  }

}
