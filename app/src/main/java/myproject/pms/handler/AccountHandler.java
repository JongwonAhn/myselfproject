package myproject.pms.handler;


import myproject.pms.domain.Account;
import myproject.util.Prompt;

public class AccountHandler {

  Prompt prompt = new Prompt();


  public int LENGTH = 100;
  public int size = 0;
  public Account[] account = new Account[LENGTH];
  public Account myaccount = new Account();



  public AccountHandler() {

    Account a = new Account();
    a.setId("admin");
    a.setPassword("admin"); 
    a.setName("관리자"); 
    a.setFlatNo("관리자"); 
    a.setRegisteredDate(new java.sql.Date(System.currentTimeMillis())); 
    a.setAdmin(1); 

    this.account[size++] = a;

  }

  public boolean menu(boolean select){

    while(select) {

      try {

        System.out.println("메인 / 계정관리-------------------------------");
        System.out.println("1. 계정정보 보기\n2. 정보 수정\n3. 계정 삭제\n4. 뒤로가기");
        int inputMenu3 = prompt.inputInt("입력>");

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

    Account account = new Account();

    System.out.println("메인 / 회원가입-------------------------------");

    account.setId(prompt.inputString("아이디: "));
    if (duplicatedId(account)) {


      account.setPassword(prompt.inputString("비밀번호: "));
      account.setName(prompt.inputString("이름: "));
      account.setFlatNo(prompt.inputString("동, 호수: "));
      account.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));
      account.setAdmin(0);      
      this.account[size++] = account;
      System.out.println("회원가입이 완료되었습니다.\n");

    }

  }

  public void detail( ) {
    System.out.println("메인 / 계정관리 / 가입정보----------------");

    System.out.printf("가입 id :  %s\n", myaccount.getId());
    System.out.printf("비밀번호 : %s\n", myaccount.getPassword());
    System.out.printf("이름   :   %s\n", myaccount.getName());
    System.out.printf("동, 호수 : %s\n", myaccount.getFlatNo());
    System.out.printf("가입일  :  %s\n\n ", myaccount.getRegisteredDate());
  }

  public void update() {
    System.out.println("메인 / 내 계정관리 / 가입정보 변경---------------");

    String id = prompt.inputString(String.format
        ("변경할 id(%s)?", myaccount.getId()));
    String password = prompt.inputString(String.format
        ("변경할 PW(%s)?", myaccount.getPassword()));
    String name = prompt.inputString(String.format
        ("변경할 이름(%s)?", myaccount.getName()));
    String flatNo = prompt.inputString(String.format
        ("변경할 주소(%s)?", myaccount.getFlatNo()));

    String input = prompt.inputString("정말 변경하시겠 습니까?(y/N)");
    if (input.equalsIgnoreCase("Y")) {

      myaccount.setId(id);
      myaccount.setPassword(password);  
      myaccount.setName(name);
      myaccount.setFlatNo(flatNo);
      System.out.println("게시글을 변경하였습니다.\n");

    }else {
      System.out.println("게시글 변경을 취소하였습니다.\n");
    }
  }

  public boolean delete(boolean select) {
    System.out.println("메인 / 내 계정관리 / 회원탈퇴---------------");

    if(myaccount.getAdmin() == 0) {

      String input = prompt.inputString("정말 탈퇴하시겠습니까?(y/N)");

      if(input.equalsIgnoreCase("Y")) {

        for(int i=0; i<account.length; i++) {
          if(myaccount==account[i]) {
            account[i]=null;
            System.out.println("탈퇴 되었습니다! \n");
            return false;
          }
        }
      }
    }else {
      System.out.println("관리자 계정은 삭제 불가!");
    }

    return true;
  }

  //  public String findbyId(String AccountId) {
  //
  //    for (int i = 0; i < this.size; i++) {
  //      String account = this.account[i].id;
  //      if (this.account[i].id == AccountId) {
  //        return this.account[i].id;
  //      }
  //    }
  //    return null;
  //
  //  }

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

  public boolean chkAcccount() {

    boolean rtn = false;

    for (int i = 0; i < account.length; i++) {
      if ((account[i] != null)) {
        rtn = true;
        break;
      }

    }
    return rtn;

  }


  public boolean chkAcccountId(String id) {

    boolean rtn = false;

    for (int i = 0; i < account.length; i++) {
      if(account[i] != null) {
        if (account[i].getId().equals(id)) {
          rtn = true;
        }
      }
    }
    return rtn;

  }


  public boolean chkAcccountPW(String password) {

    boolean rtn = false;

    for (int i = 0; i < account.length; i++) {
      if(account[i] != null) {
        if (account[i].getPassword().equals(password)) {

          rtn = true;
          myaccount=account[i];
        }
      }
    }
    return rtn;

  }

  public boolean duplicatedId(Account a) {
    for(int i = 0; i < account.length; i++) {
      if(account[i] != null) {

        if (account[i].getId().equalsIgnoreCase(a.getId())) {
          System.out.println("중복된 아이디 입니다.\n");
          return false;
        }
      }
    }
    return true;

  }




}
