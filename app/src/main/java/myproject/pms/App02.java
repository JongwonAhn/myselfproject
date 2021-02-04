package myproject.pms;

import java.sql.Date;

import myproject.pms.handler.AccountHandler;
import myproject.util.Prompt;

public class App02 {



  public static void main(String[] args) {

    final int LENGTH = 100;
    String[] id = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] name = new String[LENGTH];
    String[] flatNo = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];

    int size = 0;


    System.out.println("[입주민 커뮤니티 프로그램]\n");

    while(true) {
      System.out.println("메인 / ----------------------------------------");
      System.out.println("1. 회원가입\n2. 로그인\n3. 뒤로가기");



      int inputMenu1 = Prompt.inputInt("입력>");
      if(inputMenu1 == 1) {

        System.out.println("메인 / 회원가입-------------------------------");

        id[size] = Prompt.inputString("아이디: ");
        password[size] = Prompt.inputString("비밀번호: ");
        name[size] = Prompt.inputString("이름: ");
        flatNo[size] = Prompt.inputString("동, 호수: ");
        registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

        size++;
        System.out.println("회원가입이 완료되었습니다.\n");



      }else if (inputMenu1 == 2){
        int index = 0;
        if (id[index] == null) {
          System.out.println("회원가입을 먼저 진행해주세요.\n");
        }


        for(int i = 0; i < size; i++) {
          System.out.println("메인 / 로그인---------------------------------\n");
          String inputId = Prompt.inputString("아이디: ");

          if(inputId.equals(id[i])) {
            String inputPassword = Prompt.inputString("비밀번호: ");

            if(inputPassword.equals(password[i])) {
              System.out.println("로그인 되었습니다!\n");

              while(true) {
                System.out.println("메인 / 메뉴선택-------------------------------");
                System.out.println("1. 내 계정관리\n2. 게시판 가기\n3. 아파트 공지 보기\n4. 뒤로가기");

                int inputMenu2 = Prompt.inputInt("입력>");

                if (inputMenu2 == 1) { //계정관리 내 메뉴

                  AccountHandler.Menu();


                }else if (inputMenu2 == 2) {

                }else if (inputMenu2 == 3) {

                }else if (inputMenu2 == 4) {

                  break;
                }else {
                  System.out.println("잘못 입력했습니다");
                }


              }







            }else {
              System.out.println("비밀번호가 일치하지 않습니다! 다시 로그인 하세요.");

            }
          }else {
            System.out.println("등록된 아이디가 없습니다!");
          }
        }


      }else if (inputMenu1 == 3) {
        System.out.println("사용을 종료합니다.");
        break;
      }else {
        System.out.println("잘못 입력하셨습니다.\n");
      }


    }





    Prompt.close();
  }
}
