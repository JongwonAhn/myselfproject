package myselfproject;

public class CarNumberList {

  /*------------------------------------------------------------------------------------*/
  // 메뉴 모음집
  static void menu1 () {
    System.out.println("1. 조회할 차량번호 입력하기  2. 뒤로가기"); // menu void menu1  
  }
  /*------------------------------------------------------------------------------------*/
  // 입력 모음집
  static int intInput () {
    return mypj.keyScan.nextInt(); // 입력 Int intInputMenu1  
  }

  /*------------------------------------------------------------------------------------*/
  //텍스트 모음집 
  static void text1() {

    System.out.println("등록한 차량번호를 입력해 주세요"); // text void text1
    System.out.println("등록된 차량 리스트");

  }

  /*------------------------------------------------------------------------------------*/

  /*------------------------------------------------------------------------------------*/
  //모듈 로직
  static boolean modul1(int check) {

    if (check==1) { // check boolean intCheck1

      text1();

      int input1 = ScannerInput.IntInput(carListInfo());
      //carNumber[2];

      for(int i=0; i<mypj.carNumber.length; i++ ) { //carNumber배열안의 값을 조회하기 위해서 사용.

        if(input1 == mypj.carNumber[i]) { //2. 에서 while문을 한번더넣어서 기능추가. 

          while(true) {
            System.out.println("1.등록정보보기 2. 등록삭제 3. 뒤로가기");
            int input2 = mypj.keyScan.nextInt();

            if(input2 == 1) { // 등록정보 조회기능. 해당차량번호를 불러와양함. 

              System.out.println("해당차량 정보");
              System.out.println("차량 번호 : "+ mypj.carNumber[i]);
              System.out.println("  차종    : "+mypj.carkind[i]);
              System.out.println("소유주 이름 :"+mypj.onerName[i]);
              System.out.println("등록 날짜 :"+mypj.registerDate[i]);


            }else if(input2 == 2) { // 등록삭제. 구현x
              System.out.println("아직 삭제못함");

            }else if(input2 == 3) { //뒤로가기
              break;

            }else {
              System.out.println("잘못입력했습니다 1");
            }
          }
        }
      }   
    }else if(check == 2){
      return false;
    }else {
      System.out.println("잘못입력했습니다3");
      return true;
    }
    return true;
  }

  static void listCarNumber() {

    boolean roop=true;
    while(roop) {
      menu1();

      int input0 =intInput();

      roop=modul1(input0);
    } 
  }







  /*------------------------------------------------------------------------------------*/
  static String carListInfo () {
    String carList="";
    for(int i=0; i<mypj.carNumber.length; i++ ) { // carlist void carListInfo
      carList+=mypj.carNumber[i] +"|";     //carList==carnumber | carnumber | carnumber |
    }
    return carList;
  }

}
