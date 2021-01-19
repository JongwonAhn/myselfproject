package myselfproject;

import java.sql.Date;
import java.util.Scanner;

public class selfproject01 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    final int MAX = 3;

    int carNumber[] = new int[MAX];
    String carkind[] = new String[MAX];
    String onerName[] = new String[MAX];
    Date registerDate[] = new Date[MAX]; 
    int count = 0; //카운트는 while문이 돌때마다 초기화되면 안되므로 이곳에.

    System.out.println("[주차 관리 프로그램]");



    while(true) {

      System.out.println("1. 차량 등록(숫자만가능)  2. 차량 조회 3. 남은 등록가능횟수 조회 4. 프로그램 종료");
      // 이 메세지도 반복되야되기떄문에 while안으로

      int input = keyScan.nextInt();

      if(input == 1) { //1. 차량등록기능
        System.out.println("차량번호를 입력하세요.");
        keyScan.nextLine();
        carNumber[count] = Integer.parseInt(keyScan.nextLine());
        //carNumber[0] =  입력한 값 을 저장 
        System.out.println("차종을 입력하세요");
        carkind[count] = keyScan.nextLine();

        System.out.println("소유주 이름을 입력하세요");
        onerName[count] = keyScan.nextLine();

        System.out.println("차량 등록시간을 입력해주세요 20xx-yy-zz로");
        registerDate[count] = Date.valueOf(keyScan.nextLine());


        count++;



      }else if(input == 2) { //2. 차량조회기능 
        while(true) {

          System.out.println("1. 조회할 차량번호 입력하기  2. 뒤로가기");

          int input0 = keyScan.nextInt();

          if (input0 == 1) {

            System.out.println("등록한 차량번호를 입력해 주세요");
            System.out.println("등록된 차량 리스트");

            for(int i=0; i<carNumber.length; i++ ) {
              System.out.println(carNumber[i]);

            }


            int input1 = keyScan.nextInt();
            //carNumber[2];

            for(int i=0; i<carNumber.length; i++ ) { //carNumber배열안의 값을 조회하기 위해서 사용.

              if(input1 == carNumber[i]) { //2. 에서 while문을 한번더넣어서 기능추가. 

                while(true) {
                  System.out.println("1.등록정보보기 2. 등록삭제 3. 뒤로가기");
                  int input2 = keyScan.nextInt();

                  if(input2 == 1) { // 등록정보 조회기능. 해당차량번호를 불러와양함. 

                    System.out.println("해당차량 정보");
                    System.out.println("차량 번호 : "+ carNumber[i]);
                    System.out.println("  차종    : "+carkind[i]);
                    System.out.println("소유주 이름 :"+onerName[i]);
                    System.out.println("등록 날짜 :"+registerDate[i]);


                  }else if(input2 == 2) { // 등록삭제. 구현x
                    System.out.println("아직 삭제못함");

                  }else if(input2 == 3) { //뒤로가기
                    break;

                  }else {
                    System.out.println("잘못입력했습니다 1");

                  }

                }

              }

            }
          }else if(input0 == 2){
            break;

          }else {
            System.out.println("잘못입력했습니다3");
          }
        }
      }else if(input == 3) {

        if(MAX > count) {
          System.out.println("등록 가능한 차량은"+(MAX-count)+"대 남았습니다.");

        }else {
          System.out.println("더이상 등록이 불가능 합니다.");
        }


      }else if(input == 4) {
        System.out.println("사용해주셔서 감사합니다");
        break;
      }else
        System.out.println("잘못입력했습니다. 다시 입력해 주세요");


    }





    keyScan.close();
  }

}
