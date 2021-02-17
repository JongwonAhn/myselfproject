package javaBook.q05;

public class Exam05 {
  public static void main(String[] args) {

    int n = 24;

    switch(n/10) {

    case 0 :
      System.out.println("0이상 10미만");
      break;
    case 1 :
      System.out.println("10이상 20미만");
      break;
    case 2 :
      System.out.println("20이상 30미만");
      break;
    default : 
      System.out.println("음수 혹은 30 이상");
    }

  }

}
