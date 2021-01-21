package myselfproject;

import java.sql.Date;
import java.util.Scanner;

public class mypj {

  static Scanner keyScan = new Scanner(System.in);

  static final int MAX = 3;

  static int carNumber[] = new int[MAX];
  static String carkind[] = new String[MAX];
  static String onerName[] = new String[MAX];
  static Date registerDate[] = new Date[MAX]; 
  static int count = 0; //카운트는 while문이 돌때마다 초기화되면 안되므로 이곳에.





  public static void main(String[] args) {


    System.out.println("[주차 관리 프로그램]");



    while(true) {



      int input = ScannerInput.IntInput("1. 차량 등록(숫자만가능)  2. 등록된 차량목록 3. 남은 등록가능횟수  4. 프로그램 종료");

      if(input == 1) { //1. 차량등록기능

        CarNumberRegister.registerCarNumber();


      }else if(input == 2) { //2. 차량조회기능 

        CarNumberList.listCarNumber();

      }else if(input == 3) {

        PossibleNumber.showPossibleNumber();


      }else if(input == 4) {

        System.out.println("사용해주셔서 감사합니다");
        break;

      }else
        System.out.println("잘못입력했습니다. 다시 입력해 주세요");


    }





    keyScan.close();
  }

}
