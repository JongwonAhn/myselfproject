package myproject.pms.handler;

import java.sql.Date;

import myproject.util.Prompt;

public class AccountHandler {

  static class Account {

    String id;
    String password;
    String name;
    String flatNo;
    Date registeredDate;


  }

  static final int LENGTH = 100;
  static int size = 0;
  static Account[] account = new Account[LENGTH];


  public static void Menu(){

    while(true) {

      System.out.println("메인 / 내 계정관리-------------------------------");
      System.out.println("1. 내 정보보기\n2. 정보수정\n3. 계정삭제\n4. 뒤로가기");
      int inputMenu3 = Prompt.inputInt("입력>");

      if(inputMenu3 == 1) { //계정 상세정보 보기. 이안에서 삭제, 수정 처리
        detail();

      }else if (inputMenu3 == 2) {// 수정

      }else if (inputMenu3 == 3) {// 삭제

      }else if (inputMenu3 ==4){
        System.out.println("뒤로가기\n");
        break;

      }else {
        System.out.println("잘못 입력했습니다. 다시입력해주세요");
      }



    }


  }
  //회원가입 
  public static void add() {

    Account a = new Account();

    System.out.println("메인 / 회원가입-------------------------------");

    a.id = Prompt.inputString("아이디: ");
    a.password = Prompt.inputString("비밀번호: ");
    a.name = Prompt.inputString("이름: ");
    a.flatNo = Prompt.inputString("동, 호수: ");
    a.registeredDate = new java.sql.Date(System.currentTimeMillis());

    account[size++] = a;
    System.out.println("회원가입이 완료되었습니다.\n");





  }

  static void detail() {
    System.out.println("");



  }

  public String findbyId(String AccountId) {

    for (int i = 0; i < this.size; i++) {
      String account = this.account[i].id;
      if (this.account[i].id == AccountId) {
        return this.account[i].id;
      }
    }
    return null;

  }

  //  String indexOf(String accountId) {
  //    for (int i = 0; i < this.size; i++) {
  //      Account account = this.account[i];
  //      if (account.id == accountId) {
  //        return account.id;
  //      }
  //
  //    }
  //  }
  /*

  public static boolean chkAcccount(String Mode,String param) {

    boolean rtn = false;

    if(Mode.equals("id")) {

    }else if(Mode.equals("password")){

    }else if(Mode.equals("chkAccount")){

    }else {
      return false;
    }


    for (int i = 0; i < account.length; i++) {
      if (!(account[i] == null)) {
        rtn = false;
        break;
      }

    }
    return rtn;
  }

  public boolean snailFor() {

  }
   */

  public static boolean chkAcccount() {

    boolean rtn = false;

    for (int i = 0; i < account.length; i++) {
      if ((account[i] != null)) {
        rtn = true;
        break;
      }

    }
    return rtn;

  }


  public static boolean chkAcccountId(String id) {

    boolean rtn = false;

    for (int i = 0; i < account.length; i++) {
      if(account[i] != null) {
        if (account[i].id.equals(id)) {
          rtn = true;
        }
      }
    }
    return rtn;

  }


  public static boolean chkAcccountPW(String password) {

    boolean rtn = false;

    for (int i = 0; i < account.length; i++) {
      if(account[i] != null) {
        if (account[i].password.equals(password)) {
          rtn = true;
        }
      }
    }
    return rtn;

  }





}
