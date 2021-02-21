package javaBook.q06;

public class Ex031 {
  public static void main(String[] args) {


    int i = square(3);
  }

  public static void square(int a) {

    int b = a*square(--a);

    if(a == 1) 
      return;



  } 

}
