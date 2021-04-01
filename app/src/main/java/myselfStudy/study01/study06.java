package myselfStudy.study01;


//두개의 정수를 전달받아서 두 수의 사칙연산 결과를 출력하는 메소드와 
//이 메소드를 호출하는 main 메소드를 정의해보라.

public class study06 {


  public static int add(int num1, int num2) {

    int num3;
    num3 = num1 + num2;

    return num3;

  }

  public static int minus(int num1, int num2) {

    int num3;

    num3 = num1 / num2;

    return num3;


  }



  public static void main(String[] args) {



    System.out.println(add(3, 7));



  }

}