package myproject.pms.domain;

import java.sql.Date;

public class Notice {

  int no;
  String title;
  String contents;
  Date registeredDate;
  long deleteDate;
  long currentDate;

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  public long getDeleteDate() {
    return deleteDate;
  }
  public void setDeleteDate(long deleteDate) {
    this.deleteDate = deleteDate;
  }
  public long getCurrentDate() {
    return currentDate;
  }
  public void setCurrentDate(long currentDate) {
    this.currentDate = currentDate;
  }



}
