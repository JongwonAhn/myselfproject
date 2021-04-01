package myselfStudy.study01;

public class study4 {
  public static void main(String[] args) {

    int arry[] = new int[5];

    for (int i = 0; i <arry.length; i++) {
      arry[i] = i * 10;

    }
    System.out.println("몇번을 지우시겠습니까?");
    int a =3;

    System.out.println(a+"번을 지우겠습니다.");

    for(int i=0; i<arry.length; i++) {

      if(i==3-1) {
        if(i!=4) {
          arry[i]=arry[i+1];
          arry[i+1]=0;
        }
        else if(a==5){
          arry[i-1]=0;
        }
        else if(a<1){
          System.out.println("잘못입력하셨습니다.");
        }
      }

    }
    String b="";
    for(int i=0; i<arry.length; i++) {
      b+= arry[i]+",";
    }
    System.out.println(b);
  }

}
