package javaBook.q05;

public class Exam14 {
  public static void main(String[] args) {

    //    A B     만족하는 모든 A, B조합
    //  + B A
    //    9 9 
    for(int i = 0; i < 10; i++ ) {

      for(int j = 0; j < 10; j++) {

        if(i + j == 9) {
          //        if((i*10+j)+(j*10+1)==99){
          System.out.println(i +","+ j);
        }

      }

    }

  }

}
