package javaBook.q06;

public class Ex099 {

  public static void main(String[] args) {

    String s="";
    for(int i=1; i<=100; i++){

      boolean result=check(i);

      if(result){
        s+=i+",";   
      }
    }

    System.out.println(s);

  }

  public static boolean check(int a){

    int count=0;

    for(int i=1; i<=a; i++){

      int b= a%i;   
      if( b==0){
        count++;
      }
    }

    if( count == 2){
      return true;
    }else{
      return false;
    }

  }

}
