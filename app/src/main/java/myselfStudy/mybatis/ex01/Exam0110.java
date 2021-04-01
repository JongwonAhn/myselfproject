package myselfStudy.mybatis.ex01;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0110 {
  public static void main(String[] args) throws Exception {



    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
        "myselfStudy/mybatis/ex01/mybatis-config.xml")).openSession();


    List<Board> boards = sqlSession.selectList("BoardMapper.selectBoard");

    for(Board b : boards) {
      System.out.printf("%d,%s,%s,%s,%d\n",
          b.getNo(),
          b.getTitle(),
          b.getContent(),
          b.getRegisteredDate(),
          b.getViewCount());

    }


    sqlSession.close();


  }

}
