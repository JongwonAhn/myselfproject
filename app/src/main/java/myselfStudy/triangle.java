package myselfStudy;

public class triangle {

  public static void main(String[] args) {


    int num = 0;
    for(int i = 0; i < 5; i++) {

      for(int j = 5; i < j; j --) {
        System.out.print(" ");
      }

      for(int k=0; k<=num; k++) {
        System.out.print("*"); 

      }
      num+=2;
      System.out.println();

    }
  }
}
