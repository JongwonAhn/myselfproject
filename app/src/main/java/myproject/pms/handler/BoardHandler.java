package myproject.pms.handler;

import java.sql.Date;

import com.eomcs.util.Prompt;

import myproject.pms.domain.Board;


public class BoardHandler {


  public final int SIZE = 100;
  public Board[] board = new Board[SIZE];
  public int size = 0;

  public void BoardMain() {

    while(true) {

      try {

        System.out.println("메인 / 게시판 메인-------------------------------\n");
        System.out.println("1. 게시글 작성\n2. 게시글 보기\n3. 게시글 수정\n4. 게시글 삭제\n5. 뒤로가기\n ");
        int inputMenu = Prompt.inputInt("입력>");

        if (inputMenu == 1) { // 게시글 작성
          this.add();

        }else if (inputMenu == 2) { // 게시글 보기
          this.List();

        }else if (inputMenu == 3) { // 게시글 수정
          this.update();

        }else if (inputMenu == 4) { // 게시글 삭제
          this.delete();

        }else if (inputMenu == 5) {
          break;

        }else {
          System.out.println("잘못 입력하였습니다.1111111111111111111111111");
        }
      } catch(Exception e) {
        System.out.println("잘못 입력하였습니다.2222222222222222222222222222");
      }
    }

  }

  public void add() {

    System.out.println("메인 / 게시판 메인 / 게시글작성----------------\n");

    Board b = new Board();

    b.setNo(Prompt.inputInt("게시글 번호?"));
    b.setTitle(Prompt.inputString("게시글 제목?"));
    b.setContent(Prompt.inputString("게시글 내용"));
    b.setRegisteredDate(new Date(System.currentTimeMillis()));
    b.setWriter(Prompt.inputString("작성자 입력"));

    this.board[size++] = b;
  }

  public void List() {

    System.out.println("메인 / 게시판 메인 / 게시글 목록----------------\n");

    for(int i = 0; i < size; i++) {
      Board b = board[i];

      if(b == null)
        continue;

      System.out.printf("%s, %s, %s, %s, %s\n",
          b.getNo(), b.getTitle(), b.getContent(), b.getWriter(), b.getRegisteredDate());
    }      
  }

  public void update() {
    System.out.println("메인 / 게시판 메인 / 게시글 수정----------------\n");

    int no = Prompt.inputInt("번호? ");

    for(int i = 0; i < this.size; i++) {
      Board board = this.board[i];
      if(board.getNo() == no) {

        String title = Prompt.inputString(String.format("제목(%s)?", board.getTitle()));
        String content = Prompt.inputString(String.format("내용?(%s)", board.getContent()));
        String input = Prompt.inputString("정말 변경하시겠습니까?(y/N)");

        if (input.equalsIgnoreCase("Y")) {

          board.setTitle(title);
          board.setContent(content);
          System.out.println("게시글을 수정하였습니다.\n");

        }else {
          System.out.println("게시글 변경을 취소하였습니다.\n");
          return;
        }
      }
    }
    System.out.println("해당번호 게시글이 없습니다!\n");
    return;
  }


  public void delete() {
    System.out.println("메인 / 게시판 메인 / 게시글 삭제----------------\n");

    int no = Prompt.inputInt("석제할 번호? ");

    for(int i = 0; i < this.size; i++) {
      Board board = this.board[i];

      if(board.getNo() == no) {
        String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N)");

        if(input.equalsIgnoreCase("y")) {
          this.board[i] = null;
          System.out.println("게시글을 삭제하였습니다.\n");

        }else {
          System.out.println("게시글 삭제를 취소하였습니다\n");
          return;
        }
      }
    }
    System.out.println("해당번호의 게시글이 없습니다!\n");
    return;

  }

}
