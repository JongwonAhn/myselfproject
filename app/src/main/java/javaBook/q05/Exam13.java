package javaBook.q05;

public class Exam13 {
  public static void main(String[] args) {

    for(int i = 2; i < 10 ; i++) {



      for(int j = 1; j < 10; j++ ) {
        if(i%2 == 0 && j <= i) {

          int sum = i*j;
          System.out.println(i +"*"+ j+ "=" +sum);

          //          System.out.println(sum);

        }



      }
    }
  }

}
