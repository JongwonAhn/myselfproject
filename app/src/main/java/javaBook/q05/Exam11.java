package javaBook.q05;

public class Exam11 {
  public static void main(String[] args) {

    int num;
    int count = 0;

    //    while(num++<100) 
    for(num = 1; num < 100; num++) {

      if(num%5 != 0 || num%7 != 0) 
        continue;

      count++;
      System.out.println(num);


    }
    System.out.println(count);
  }

}
