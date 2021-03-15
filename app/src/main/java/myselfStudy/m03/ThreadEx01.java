package myselfStudy.m03;

import java.util.Scanner;

//1. 화면에 ‘0’이라는 숫자가 1초에 한번씩 찍힌다.
//2. 사용자에게 글자를 입력 받는데 문자를 입력 받으면 
//   숫자를 입력하라는 메시지를 보여주고 다시 입력을 받는다.
//3. 숫자를 입력 받으면 화면에 1초에 
//   한번씩 보이던 ‘0’ 숫자가 입력 받은 숫자로 변한다.

public class ThreadEx01 {



  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    MyThread myThread = new MyThread();

    myThread.start();

    while(true) {

      System.out.println("변경할 숫자 입력");
      int input = keyboard.nextInt();

      if(input != 999) {

        myThread.setNum(input);
      }else {
        break;
      }


    }

    keyboard.close();
  }

  static class MyThread extends Thread{

    int num = 0;

    @Override
    public void run() {

      while(true){

        try{
          MyThread.sleep(1000);
          System.out.println(num);

        }catch(Exception e) {
          e.printStackTrace();
        }

      }
    }

    public void setNum(int num) {
      this.num = num;
    }
  }
}
