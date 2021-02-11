package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberHandler {

  public final int LENGTH = 100;
  Member[] members = new Member[LENGTH];  // 레퍼런스 배열 준비  
  int size = 0;

  public  void add() {
    System.out.println("[회원 등록]");

    // 1) 회원 정보를 담을 메모리를 준비한다.
    Member m = new Member();

    // 2) 사용자가 입력한 값을 Member 인스턴스에 저장한다.
    m.no = Prompt.inputInt("번호? ");
    m.name = Prompt.inputString("이름? ");
    m.email = Prompt.inputString("이메일? ");
    m.password = Prompt.inputString("암호? ");
    m.photo = Prompt.inputString("사진? ");
    m.tel = Prompt.inputString("전화? ");
    m.registeredDate = new java.sql.Date(System.currentTimeMillis());

    this.members[this.size++] = m;

  }

  public  void list() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < this.size; i++) {
      Member m = this.members[i];
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }

  public  boolean exist(String name) {
    for(int i = 0; i < this.size; i++) {
      if(name.equals(this.members[i].name)) {
        return true;
      }
    }
    return false;

  }

}
