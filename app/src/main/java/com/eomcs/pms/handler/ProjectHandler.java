package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Project;
import com.eomcs.util.Prompt;

public class ProjectHandler {


  public MemberHandler memberList;

  static final int LENGTH = 100;
  Project[] projects = new Project[LENGTH];
  int size = 0;

  public ProjectHandler(MemberHandler memberHandler) {
    this.memberList = memberHandler;
  }

  public  void add() {

    Project p = new Project();

    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");

    while(true) {
      String name = Prompt.inputString("만든이?(취소: 빈 문자열) ");
      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      }
      if(memberList.exist(name)) {
        p.owner = name;
        break;
      }
      System.out.println("등록된 회원이 아닙니다.");
    }

    p.members = "";
    while(true) {
      String name = Prompt.inputString("팀원? (완료: 빈 문자열) ");
      if(name.length() == 0) {
        break;
      }else if(memberList.exist(name)) {
        if (!p.members.isEmpty()) {
          p.members +=",";
        }
        p.members += name;
      }else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }

    projects[size++] = p;

  }

  public  void list() {
    for (int i = 0; i < size; i++) {
      Project p = projects[i];
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n", // 출력 형식 지정
          p.no, p.title, p.content, p.startDate, p.endDate, p.owner, p.members);
    }
  }



}
