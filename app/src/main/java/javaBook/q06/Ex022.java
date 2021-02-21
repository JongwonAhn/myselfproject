package javaBook.q06;

public class Ex022 {
  public static void main(String[] args) {

    for(int i = 1; i <= 100; i++) {


      if(prime(i)) {
        System.out.println(i);
      }

    }
  }

  public static boolean prime(int a) {

    for(int i = 2; i <= a; i++) {

      if(a % i == 0){
        return true;
      }
      else {

      }
    }
    return false;
  }
}
