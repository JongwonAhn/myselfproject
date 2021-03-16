package myproject.pms.handler;

import myproject.pms.domain.Notice;
import myproject.util.Prompt;

public class NoticeHandler {


  public final int SIZE = 100;
  public Notice[] notice = new Notice[SIZE];
  public int size = 0;

  //  ArrayList<Notice> noticeHandler = new ArrayList<>();


  public void addNotice() {

    System.out.println("메인 / 공지하기 -----------------------\n");

    Notice notice = new Notice();
    notice.setNo(Prompt.inputInt("공지 번호 입력"));
    notice.setTitle(Prompt.inputString("공지 제목 입력"));
    notice.setContents(Prompt.inputString("공지 내용 입력"));
    notice.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));


    this.notice[size++] = notice;

    System.out.println("게시글 저장이 완료되었습니다.\n");

  }

  public void listNotice() {

    System.out.println("메인 / 공지보기 -----------------------\n");

    for(int i = 0; i < size; i ++) {
      System.out.printf("%s %s %s %s\n",
          notice[i].getNo(),
          notice[i].getTitle(),
          notice[i].getContents(),
          notice[i].getRegisteredDate());


    }

  }


}
