package javaBook.q06;

public class Ex021 {
  public static void main(String[] args) {

    double a, b;
    a = area(2.5);
    b = circum(3.5);

    System.out.println(a);
    System.out.println(b);

  }

  public static double area(double redius) {

    double area = 3.14*redius*redius;


    return area;
  }

  public static double circum(double redius) {

    double circum = 3.14 * 2 * redius;

    return circum;
  }
}
