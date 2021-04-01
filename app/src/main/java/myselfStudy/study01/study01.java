package myselfStudy.study01;

import java.util.Scanner;

public class study01 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    int i;
    int j;
    int k = -1;

    int[] array = new int[3];
    while(true) {
      for ( i = 0; i < array.length; i++) {

        array[i] = keyScan.nextInt();


        array[i-1 ] = array[i];



        for (j=0; j < array.length; j++)


          System.out.print(array[j]);
        System.out.println("");


      }


    }

  }

}
