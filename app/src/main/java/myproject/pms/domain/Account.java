package myproject.pms.domain;

import java.sql.Date;

public class Account {


  private String id;
  private String password;
  private String name;
  private String flatNo;
  private Date registeredDate;
  private  int admin;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getFlatNo() {
    return flatNo;
  }
  public void setFlatNo(String flatNo) {
    this.flatNo = flatNo;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  public int getAdmin() {
    return admin;
  }
  public void setAdmin(int admin) {
    this.admin = admin;
  }




}
