package myselfStudy;

import java.util.Scanner;

/*
 * 1. 시간입력중 오전인지 오후인지 입력한다 
( pm~ am )

2.시간을 입력한다  
0~12시 00분 ~59분 까지 

3. 메서드를 통해 입력한시간을 24진수로 변환한다. 
ex: pm 13:40  은  15:40분 

4. 변환한 값을 출력한다 
 */


public class TimeChange {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("시간, 분 순서로 시간 입력.");
    System.out.println("시간 입력");
    int hour = keyboard.nextInt();
    Time t = new Time(hour);


    int minuts = 0;
    while(true) {

      System.out.println("분 입력");
      int m = keyboard.nextInt();

      if(m >= 60) {
        System.out.println("다시 입력해주세요");
      }else {

        minuts += m;
        break;
      }
    }

    if(t.hour > 12) {
      System.out.printf("pm : %d : %d",t.hour, minuts );      
    }else {

      System.out.printf("am :%d : %d",t.hour, minuts );
    }

    keyboard.close();
  }

}
class Time{

  int hour;

  Time(int hour) {

    this.hour = hour;
  }

  int Time() {

    if(this.hour > 12) {
      return this.hour + 12;

    }else {
      return this.hour;
    }
  }
}


