package myselfStudy;

public class studyMethod02 {

  static class Calculator{

    int number;
    String name;
    int tell;


  }

  public static void main(String[] args) {


    Calculator c = new Calculator();

    c.number = 20;
    c.name = "길동";
    c.tell = 12345678;

    System.out.println(c.name);

    Calculator[] d = new Calculator[5];

    d[0] = new Calculator();

    d[0].number = 1;
    d[0].name = "명일동";
    d[0].tell = 567;

    System.out.println(d[0]);

  }

}
