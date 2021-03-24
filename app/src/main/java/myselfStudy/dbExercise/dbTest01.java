package myselfStudy.dbExercise;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class dbTest01 {
  public static void main(String[] args) throws Exception {

    String title = null;
    String content = null;
    String no = null;

    try(Scanner keyScan = new Scanner(System.in)){



      //      System.out.println("번호?");
      //      no = keyScan.nextLine();

      System.out.println("제목?");
      title = keyScan.nextLine();

      System.out.println("내용?");
      content = keyScan.nextLine();

      System.out.println("입력하시겠습니까?y/n");
      String input = keyScan.nextLine();

      if(!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소하였습니다");
        return;
      }

    }


    try {
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb:");

      System.out.println(driver);
      //////////
      java.sql.Connection con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb",
          "study",
          "1111"
          );
      System.out.println(con.getClass().getName());
      //      데이터입력----------------------
      PreparedStatement stmt = con.prepareStatement(
          "insert into test1(title,content) values(?,?)",
          Statement.RETURN_GENERATED_KEYS);

      stmt.setString(1, title);
      stmt.setString(2, content);
      //      stmt.setString(3, no);
      //      String sql = String.format(
      //          "insert into test1(title, content) values('%s','%s')",
      //          title, content
      //          );
      int count = stmt.executeUpdate();
      System.out.printf("%d개 입력 성공!", count);

      try (ResultSet rs = stmt.getGeneratedKeys()){
        rs.next();
        int no1 = rs.getInt(1);
        System.out.printf("입력된 게시글 번호: %d", no1);
      }

      //----------------------------------------
      //
      // 데이터 조회------------------------
      //      PreparedStatement stmt1 = con.prepareStatement(
      //          "select * from test1 order by no desc");
      //
      //
      //      java.sql.ResultSet rs = stmt1.executeQuery(
      //
      //          );
      //
      //      while(rs.next()) {
      //        System.out.printf("%s, %s, %s, %s\n", 
      //            rs.getString("no"),
      //            rs.getString("title"),
      //            rs.getString("content"),
      //            rs.getString("name"));
      //      }
      //       -------------------------------------------------





    }catch (Exception e) {
      e.printStackTrace();
    }

  }

}
