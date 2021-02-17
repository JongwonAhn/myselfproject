package myproject.pms;

import myproject.pms.handler.AccountHandler;
import myproject.pms.handler.NoticeHandler;
import myproject.util.Prompt;

public class App01 {

  public static void main(String[] args) {

    Prompt pt=new Prompt();
    AccountHandler accountHandler = new AccountHandler();
    NoticeHandler noticeHandler = new NoticeHandler();

    boolean select=true;

    System.out.println("[입주민 커뮤니티 프로그램]\n");

    while (true) { 
      select = true; 
      System.out.println("메인 / ----------------------------------------");
      System.out.println("1. 회원가입\n2. 로그인\n3. 종료하기");

      int inputMenu1 = pt.inputInt("입력>");
      if (inputMenu1 == 1) {

        accountHandler.add();

      } else if (inputMenu1 == 2) {

        if(!accountHandler.chkAcccount()) {
          System.out.println("회원가입을 먼저 진행해주세요.\n");

        } else {

          System.out.println("메인 / 로그인---------------------------------");
          String inputId = pt.inputString("아이디: ");

          if (accountHandler.chkAcccountId(inputId)) {
            String inputPassword = pt.inputString("비밀번호: ");

            if (accountHandler.chkAcccountPW(inputPassword)) {
              System.out.println("로그인 되었습니다!\n");

              while (select) {

                System.out.println("메인 / 메뉴선택-----------------------------");
                if(accountHandler.myaccount.getAdmin()==0) {
                  System.out.println("1. 내 계정관리\n2. 게시판 가기\n3. 아파트 공지 보기\n4. 뒤로가기");
                }
                else {
                  System.out.println("1. 내 계정관리\n2. 게시판 가기\n3. 아파트 공지 보기\n4. 뒤로가기\n5. 공지하기");                  
                }

                int inputMenu2 = pt.inputInt("입력>");

                if (inputMenu2 == 1) { // 계정관리 내 메뉴

                  select=accountHandler.Menu(select);

                } else if (inputMenu2 == 2) { // 게시판


                } else if (inputMenu2 == 3) { // 공지보기

                  noticeHandler.readNotice();

                } else if (inputMenu2 == 4) { // 뒤로가기
                  break;

                } else if (inputMenu2 == 5 && accountHandler.myaccount.getAdmin() == 1 ) { 
                  //공지 하기(관리자만 실행가능

                  noticeHandler.writeNotice();

                } else {
                  System.out.println("잘못 입력했습니다\n");
                }
              }
            } else {
              System.out.println("비밀번호가 일치하지 않습니다! 다시 로그인 하세요.\n");
            }
          } else {
            System.out.println("등록된 아이디가 없습니다!\n");
          }

        }

      } else if (inputMenu1 == 3) {
        System.out.println("사용을 종료합니다.");
        break;
      } else {
        System.out.println("잘못 입력하셨습니다.\n");
      }

    }

    pt.close();
  }
}
