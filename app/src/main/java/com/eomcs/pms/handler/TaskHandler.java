package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskHandler {


  public MemberHandler memberList;

  public TaskHandler(MemberHandler memberHandler) {
    this.memberList = memberHandler;
  }

  // 작업 데이터
  static final int LENGTH = 100;
  Task[] tasks = new Task[LENGTH];

  int size = 0;

  public  void add() {

    Task t = new Task();

    t.no = Prompt.inputInt("번호? ");
    t.content = Prompt.inputString("내용? ");
    t.deadline = Prompt.inputDate("마감일? ");
    t.status = Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");

    while(true) {
      String name = Prompt.inputString("담당자?(취소: 빈문자열)");
      if(name.length() == 0) {
        System.out.println("작업 등록을 취소합니다");
        break;
      }else if(memberList.exist(name)){
        t.owner = name;
        break;
      }else {
        System.out.println("등록된 회원이 아닙니다.");
      }

    }

    this.tasks[this.size++] = t;
  }

  public  void list() {

    for (int i = 0; i < this.size; i++) {
      Task t = this.tasks[i];

      String stateLabel = null;

      switch (t.status) {
      case 1:
        stateLabel = "진행중";
        break;
      case 2:
        stateLabel = "완료";
        break;
      default:
        stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          t.no, t.content, t.deadline, stateLabel, t.owner);
    }
  }

}
