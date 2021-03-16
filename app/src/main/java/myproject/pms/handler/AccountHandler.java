package myproject.pms.handler;


import java.util.ArrayList;
import java.util.Iterator;

import myproject.pms.domain.Account;
import myproject.util.Prompt;

public class AccountHandler {

  public ArrayList<Account> accountList = new ArrayList<>();
  public Iterator<Account> iterator = accountList.iterator();
  public Account a = iterator.next();

  //  public int LENGTH = 100;
  //  public int size = 0;
  //  public Account[] account = new Account[LENGTH];
  //  public Account myaccount = new Account();



  public AccountHandler() {
    a.setId("admin");
    a.setPassword("admin"); 
    a.setName("관리자"); 
    a.setFlatNo("관리자"); 
    a.setRegisteredDate(new java.sql.Date(System.currentTimeMillis())); 
    a.setAdmin(1); 

    accountList.add(a);
    //    this.account[size++] = a;

  }

  public boolean menu(boolean select){

    while(select) {

      try {

        System.out.println("메인 / 계정관리-------------------------------");
        System.out.println("1. 계정정보 보기\n2. 정보 수정\n3. 계정 삭제\n4. 뒤로가기");
        int inputMenu3 = Prompt.inputInt("입력>");

        if(inputMenu3 == 1) { //계정 상세정보 보기. 이안에서 삭제, 수정 처리
          detail();

        }else if (inputMenu3 == 2) {// 수정
          update();

        }else if (inputMenu3 == 3) {// 삭제
          return delete(select);

        }else if (inputMenu3 ==4){
          System.out.println("뒤로가기\n");
          break;

        }else {
          System.out.println("잘못 입력했습니다. 다시입력해주세요\n");
        }

      }catch(Exception e){
        System.out.println("잘못 입력했습니다\n");
      }

    }
    return true;

  }
  //회원가입 
  public void add() {


    System.out.println("메인 / 회원가입-------------------------------");

    a.setId(Prompt.inputString("아이디: "));
    if (duplicatedId(a)) {


      a.setPassword(Prompt.inputString("비밀번호: "));
      a.setName(Prompt.inputString("이름: "));
      a.setFlatNo(Prompt.inputString("동, 호수: "));
      a.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));
      a.setAdmin(0);      
      accountList.add(a);
      //      this.a[size++] = a;
      System.out.println("회원가입이 완료되었습니다.\n");

    }

  }

  public void detail( ) {
    System.out.println("메인 / 계정관리 / 가입정보----------------");




    System.out.printf("가입 id :  %s\n", a.getId());
    System.out.printf("비밀번호 : %s\n", a.getPassword());
    System.out.printf("이름   :   %s\n", a.getName());
    System.out.printf("동, 호수 : %s\n", a.getFlatNo());
    System.out.printf("가입일  :  %s\n\n ", a.getRegisteredDate());
  }

  public void update() {
    System.out.println("메인 / 내 계정관리 / 가입정보 변경---------------");

    String id = Prompt.inputString(String.format
        ("변경할 id(%s)?", a.getId()));
    String password = Prompt.inputString(String.format
        ("변경할 PW(%s)?", a.getPassword()));
    String name = Prompt.inputString(String.format
        ("변경할 이름(%s)?", a.getName()));
    String flatNo = Prompt.inputString(String.format
        ("변경할 주소(%s)?", a.getFlatNo()));

    String input = Prompt.inputString("정말 변경하시겠 습니까?(y/N)");
    if (input.equalsIgnoreCase("Y")) {

      a.setId(id);
      a.setPassword(password);  
      a.setName(name);
      a.setFlatNo(flatNo);
      System.out.println("게시글을 변경하였습니다.\n");

    }else {
      System.out.println("게시글 변경을 취소하였습니다.\n");
    }
  }

  public boolean delete(boolean select) {
    System.out.println("메인 / 내 계정관리 / 회원탈퇴---------------");
    Account[] list = accountList.toArray(new Account[0]);

    if(a.getAdmin() == 0) {

      String input = Prompt.inputString("정말 탈퇴하시겠습니까?(y/N)");

      if(input.equalsIgnoreCase("Y")) {

        for(Account b : list) {
          if(a == b) {
            b = null;
            System.out.println("탈퇴 되었습니다\n");
            return false;
          }else {
            System.out.println("관리자 계정은 삭제 불가");
          }

        }

      }
    }
    return select;
  }


  public boolean chkAcccount() {

    //    boolean rtn = false;
    Account[] list = accountList.toArray(new Account[0]);

    for(Account a : list) {
      if(a != null) {
        return true;
      }
    }
    return false;    
  }


  public boolean chkAcccountId(String id) {

    //    boolean rtn = false;

    Account[] list = accountList.toArray(new Account[0]);

    for(Account a : list) {
      if(a != null) {
        if (a.getId().equals(id)) {
          return true;
        }
      }
    }
    return false;

  }


  public boolean chkAcccountPW(String password) {

    //    boolean rtn = false;

    Account[] list = accountList.toArray(new Account[0]);

    for (Account a : list) {
      if(a.getPassword() == password) {
        return true;
      }
    }
    return false;
  }

  //    for (int i = 0; i < account.length; i++) {
  //      if(account[i] != null) {
  //        if (account[i].getPassword().equals(password)) {
  //
  //          rtn = true;
  //          a=account[i];
  //        }
  //      }
  //    }
  //    return rtn;


  public boolean duplicatedId(Account account) {

    Account[] list = accountList.toArray(new Account[0]);

    for(Account a : list) {
      if(a != null) {
        if(a.getId().equalsIgnoreCase(a.getId())) {
          System.out.println("중복된 아이디 입니다.\n");
          return false;
        }
      }
    }
    return true;    
  }

}
