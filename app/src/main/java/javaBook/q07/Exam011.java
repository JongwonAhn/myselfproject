package javaBook.q07;

class Triangle {

  int width;
  int height;

  public Triangle(int a, int b) {

    width = a;
    height = b;
  }

  public void bottom(int a) {
    width = a;
  }
  public void height(int b) {
    height = b;
  }
  public int area() {

    return width*height;

  }
}

public class Exam011 {

  //밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의.
  // 생성과 동시에 초기화가 가능한 생성자 정의.
  // 밑변과 높이 정보를 변경시킬수 있는 메소드와
  // 삼각형의 넓이를 계산해서 반환하는 메소드 정의.


  public static void main(String[] args) {

    Triangle tr = new Triangle(4, 2);

    System.out.println(tr.area());

    tr.height(3);
    tr.bottom(5);
    System.out.println(tr.area());

  }

}

