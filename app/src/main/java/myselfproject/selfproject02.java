package myselfproject;

import java.sql.Date;
import java.util.Scanner;

public class selfproject02 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    final int MAX = 10;

    String carNumber[] = new String[MAX];
    String carkind[] = new String[MAX];
    String address[] = new String[MAX];
    Date registerDate[] = new Date[MAX]; 
    long startTime[] = new long[MAX];
    long endTime[] = new long[MAX];
    int count = 0; //카운트는 while문이 돌때마다 초기화되면 안되므로 이곳에.

    System.out.println("[주차 관리 프로그램]");



    while(true) {

      System.out.println("1. 차량 등록  2. 차량 조회 3. 남은 등록가능횟수 조회 4. 프로그램 종료");
      // 이 메세지도 반복되야되기떄문에 while안으로

      int input = keyScan.nextInt();

      if(input == 1) { //1. 차량등록기능
        System.out.println("차량번호를 입력하세요.");
        keyScan.nextLine();

        carNumber[count] = keyScan.nextLine();
        //carNumber[0] =  입력한 값 을 저장 
        System.out.println("차종을 입력하세요");
        carkind[count] = keyScan.nextLine();

        System.out.println("동, 호수를 입력하세요");
        address[count] = keyScan.nextLine();

        System.out.println("차량 등록시간을 입력해주세요 20xx-yy-zz로");
        registerDate[count] = Date.valueOf(keyScan.nextLine());
        startTime[count] = System.currentTimeMillis();


        count++;



      }else if(input == 2) { //2. 차량조회기능 
        while(true) {

          System.out.println("1. 조회할 차량번호 입력하기  2. 뒤로가기");

          int input0 = keyScan.nextInt();

          if (input0 == 1) {


            System.out.println("등록한 차량번호를 입력해 주세요");
            System.out.println("등록된 차량 리스트");

            for(int i=0; i<carNumber.length; i++ ) {
              if(carNumber[i] != null) { // 등록된 차량만 나오게.
                System.out.println(carNumber[i]);
              }
            }

            keyScan.nextLine();
            String input1 = keyScan.nextLine();
            //carNumber[2];

            for(int i=0; i<carNumber.length; i++ ) { //carNumber배열안의 값을 조회하기 위해서 사용.

              if(input1.equals(carNumber[i])) { //2. 에서 while문을 한번더넣어서 기능추가. 

                while(true) {
                  System.out.println("1.등록정보보기 2. 등록삭제 3.주차요금보기 4. 뒤로가기");
                  int input2 = keyScan.nextInt();

                  if(input2 == 1) { // 등록정보 조회기능. 해당차량번호를 불러와양함. 

                    System.out.println("해당차량 정보");
                    System.out.println("차량 번호 : "+ carNumber[i]);
                    System.out.println("  차종    : "+carkind[i]);
                    System.out.println("  호수    : "+address[i]);
                    System.out.println("등록 날짜 :"+registerDate[i]);


                  }else if(input2 == 2) { // 등록삭제. 구현x
                    System.out.println("아직 삭제못함");

                    System.out.println("삭제할 차량번호를 선택해주세요");
                    keyScan.nextLine();
                    String deleteCar = keyScan.nextLine();

                    int k = 1;
                    for (int j = 0 + k; j < carNumber[j].length(); j++) {
                      if(deleteCar.equalsIgnoreCase(carNumber[j])) {
                        carNumber[j - 1] = carNumber[j];
                      }

                      carNumber[--j] = null; 
                    }

                  }else if(input2 == 3) {

                    endTime[i] = System.currentTimeMillis();
                    int totalTime = (int)((endTime[i] - startTime[i] ) / 1000.0);
                    int check;
                    check = 10000 * totalTime;
                    System.out.println ("경과시간"+totalTime+"시간입니다. 금액은"+check+"원 입니다" );


                  }else if(input2 == 4) { //뒤로가기
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
