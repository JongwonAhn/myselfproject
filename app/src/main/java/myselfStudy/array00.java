package myselfStudy;

public class array00 {
  public static void main(String[] args) {

    int colum =2;

    int row =0;


    int arr[][] = new int[5][5];

    int param=0;


    for(int i=0; i<25; i++){
      param=i+1;  

      if(row<5 || colum<5){  
        if(arr[row][colum]!=0){
          row +=2;
          colum -=1;
          if(row>4){
            row=0;
          }
          arr[row][colum]=param;
          row--;
          colum++;
          if(row<0){
            row=4;
          }
        }else{
          arr[row][colum]=param;
          row--; colum ++;
          if(row<0){
            row=4;
          }
          if(colum > 4){
            colum=0;
          }
        }   
      }
    }
  }
}



