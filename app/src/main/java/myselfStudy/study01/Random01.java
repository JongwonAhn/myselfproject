package myselfStudy.study01;

public class Random01 {

  public static void main(String[] args) {


    for(int i = 0; i < 10; i++) {
      int a = i;

      a =  (int)(Math.random() * 100);

      System.out.println(a);
    }

    double a;
    a = Math.log(4);
    System.out.println(a);

  }
}
