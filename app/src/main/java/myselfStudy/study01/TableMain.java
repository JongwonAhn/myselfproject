package myselfStudy.study01;

import java.util.Scanner;

public class TableMain {

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);
    testSource table = new testSource();

    String title = "info";
    String content = "hight";

    //    String input2 = keyScan.nextLine();

    table.title(title).titleHtml();

    table.th("이름").th("나이").th("성별").thHtml();
    table.content("안종원").content("28").content("남").end();
    table.content("박인제").content("28").content("남").end();

    table.tdHtml();

    // table.content(input2);









    keyScan.close();
  }

}
