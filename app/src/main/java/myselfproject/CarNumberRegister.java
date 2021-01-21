package myselfproject;

import java.sql.Date;

public class CarNumberRegister {
  static void registerCarNumber() {

    String CarNum=ScannerInput.StringInput("차량번호를 입력하세요.");
    mypj.carNumber[mypj.count] = Integer.parseInt(CarNum);
    //carNumber[0] =  입력한 값 을 저장 
    System.out.println("차종을 입력하세요");
    mypj.carkind[mypj.count] = mypj.keyScan.nextLine();

    System.out.println("소유주 이름을 입력하세요");
    mypj.onerName[mypj.count] = mypj.keyScan.nextLine();

    System.out.println("차량 등록시간을 입력해주세요 20xx-yy-zz로");
    mypj.registerDate[mypj.count] = Date.valueOf(mypj.keyScan.nextLine());

    mypj.count++;

  }

}
