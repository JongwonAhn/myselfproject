package com.eomcs.pms.handler;

import java.sql.Date;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {


  static final int LENGTH = 100;
  Board[] boards = new Board[LENGTH];
  int size = 0;


  public void add() {
    System.out.println("[게시글 등록]");

    Board b = new Board();

    b.no = Prompt.inputInt("번호?");
    b.title = Prompt.inputString("제목?");
    b.content = Prompt.inputString("내용?");
    b.writer = Prompt.inputString("작성자?");
    b.registeredDate = new Date(System.currentTimeMillis());

    this.boards[this.size++] = b;

    System.out.println("게시글을 등록하였습니다");
  }

  public void list() {

    System.out.println("[게시글 목록]");


    for(int i = 0; i < this.size; i++) {
      Board b = this.boards[i];

      if(b == null) 
        continue;

      System.out.printf("%s, %s, %s, %s, %s\n",
          b.no, b.title, b.writer, b.registeredDate, b.viewCount );
    }
  }

  public void detail() {
    System.out.println("게시글 상세보기");
    int no = Prompt.inputInt("번호? ");

    Board board = findByNo(no);
    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    board.viewCount++;
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("작성자: %s\n", board.writer);
    System.out.printf("등록일: %s\n", board.registeredDate);
    System.out.printf("조회수: %s\n", board.viewCount);
    return; 
  }

  public void update() {
    System.out.println("게시글 변경");

    int no = Prompt.inputInt("번호? ");

    Board board = findByNo(no);

    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }
    String title = Prompt.inputString(String.format("제목(%s)?", board.title));
    String content = Prompt.inputString(String.format("내용(%s)?", board.content));

    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N)");
    if(input.equalsIgnoreCase("y")) {

      board.title = title;
      board.content = content;
      System.out.println("게시글을 변경하였습니다.");
    }else {
      System.out.println("게시글 변경을 취소하였습니다.");
    }
    return;
  }

  public void delete() {

    int no = Prompt.inputInt("번호?");

    int i = indexOf(no);
    if (i == -1) {
      System.out.println("해당 번호의 게시글이 없습니다");
      return;
    }
    String input = Prompt.inputString("정말 삭제하시겠습니까?");

    if(input.equalsIgnoreCase("y")) {
      this.boards[i] = null;
      System.out.println("해당 게시글을 삭제하였습니다.");
    }else {
      System.out.println("게시글 삭제를 취소하였습니다.");
    }
    return;
  }

  int indexOf(int boardNo) {
    for(int i = 0; i < this.size; i++) {
      Board board = this.boards[i];
      if(board.no == boardNo && board != null) {
        return i;
      }
    }
    return -1;
  }

  Board findByNo(int boardNo) {
    int i = indexOf(boardNo);
    if (i == -1) {
      return null;
    }else {
      return boards[i];
    }

  }

}
