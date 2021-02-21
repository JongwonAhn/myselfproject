package javaBook.q05;

public class Exam12 {
  public static void main(String[] args) {
    //자연수 1부터 모든 홀수와 3의 배수인 짝수를 더해나가면서 
    // 그 합이 언제 1000이 넘는지, 그떄 넘는값은 얼마인지 계산하여 출력.

    int a = 1;
    int b = 0;

    while(true) {

      if(a%2 == 1 || a%6 == 0) {

        b += a;

        if (b > 1000) {
          break;
        }
      }
      a++;
    }
    System.out.println(a);
    System.out.println(b);
  }

}
