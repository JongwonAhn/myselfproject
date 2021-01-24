package myselfproject.ATM;

import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    int deposit;
    int withdraw;
    int ATM = 0;
    while(true) {



      System.out.println("1. 입금 2. 출금 3.조회");
      int input = keyScan.nextInt();

      if(input == 1) {
        System.out.println("얼마 입금할래?");

        deposit = keyScan.nextInt();

        if (deposit+ATM > 50000000) {
          System.out.println("5000만원 한도초과");



        }else if (deposit < 100000) {
          System.out.println("거지냐?");

          ATM += deposit;

        }else {
          System.out.println("정상적으로 입금되었습니다.");

          ATM += deposit;
        }

        System.out.printf("현재 ATM 잔액: %d\n", ATM);




      }else if(input == 2) {
        System.out.println("출금할 금액을 입력해주세요");
        int output = keyScan.nextInt();

        if (output > ATM) {
          System.out.printf("그만큼 돈이 없습니다. 현재 잔액: %d\n", ATM);

        }else if (output > 50000000 || output < 0) {
          System.out.println("출력 불가능");
        }else {

          ATM-= output;
          System.out.printf("정상적으로 출력되었습니다. ATM현재 잔액: %d\n", ATM);

        }





      }else if(input == 3) {
        System.out.println(ATM);






      }else {
        System.out.println("잘못입력했으니 1,2,3 중에 다시입력");
      }


    }

  }

}
