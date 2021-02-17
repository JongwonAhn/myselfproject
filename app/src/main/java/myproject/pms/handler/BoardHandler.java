package myproject.pms.handler;

import com.eomcs.util.Prompt;

import myproject.pms.domain.Board;


public class BoardHandler {

  Board board = new Board();

  public void BoardMain() {

    while(true) {

      System.out.println("메인 / 게시판 메인-------------------------------");
      System.out.println("1. 게시글 작성\n2. 게시글 수정\n3. 게시글 삭제\n4. 뒤로가기");
      int inputMenu = Prompt.inputInt("입력>");

      if (inputMenu == 1) { // 게시글 작성

      }else if (inputMenu == 2) { // 게시글 수정

      }else if (inputMenu == 3) { // 게시글 삭제

      }else if (inputMenu == 4) {
        break;

      }else {
        System.out.println("잘못 입력하였습니다.");
      }
    }
  }

  public void add() {



  }

}
