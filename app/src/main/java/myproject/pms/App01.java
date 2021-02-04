package myproject.pms;

import myproject.pms.handler.AccountHandler;
import myproject.util.Prompt;

public class App01 {

  public static void main(String[] args) {


    AccountHandler accountHandler = new AccountHandler();
    System.out.println("[입주민 커뮤니티 프로그램]\n");

    while (true) {
      System.out.println("메인 / ----------------------------------------");
      System.out.println("1. 회원가입\n2. 로그인\n3. 뒤로가기");

      int inputMenu1 = Prompt.inputInt("입력>");
      if (inputMenu1 == 1) {

        AccountHandler.add();

      } else if (inputMenu1 == 2) {

        if(!accountHandler.chkAcccount()) {
          System.out.println("회원가입을 먼저 진행해주세요.\n");

        } else {

          System.out.println("메인 / 로그인---------------------------------\n");
          String inputId = Prompt.inputString("아이디: ");

          if (accountHandler.chkAcccountId(inputId)) {
            String inputPassword = Prompt.inputString("비밀번호: ");

            if (accountHandler.chkAcccountPW(inputPassword)) {
              System.out.println("로그인 되었습니다!\n");
              while (true) {
                System.out.println("메인 / 메뉴선택-------------------------------");
                System.out.println("1. 내 계정관리\n2. 게시판 가기\n3. 아파트 공지 보기\n4. 뒤로가기");

                int inputMenu2 = Prompt.inputInt("입력>");

                if (inputMenu2 == 1) { // 계정관리 내 메뉴

                  AccountHandler.Menu();

                } else if (inputMenu2 == 2) {

                } else if (inputMenu2 == 3) {

                } else if (inputMenu2 == 4) {

                  break;
                } else {
                  System.out.println("잘못 입력했습니다");
                }
              }
            } else {
              System.out.println("비밀번호가 일치하지 않습니다! 다시 로그인 하세요.");
            }
          } else {
            System.out.println("등록된 아이디가 없습니다!");
          }

        }

      } else if (inputMenu1 == 3) {
        System.out.println("사용을 종료합니다.");
        break;
      } else {
        System.out.println("잘못 입력하셨습니다.\n");
      }

    }

    Prompt.close();
  }
}
