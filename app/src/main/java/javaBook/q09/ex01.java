package javaBook.q09;

class Rectangle{

  int ulx, uly; // 좌 상단x, y좌료
  int lrx, lry; // 우 하단x, y좌료

  public void showArea() {

    int xLen = lrx - ulx;
    int yLen = lry - uly;
    System.out.println("넓이 : "+ (xLen*yLen));

  }

  public int check(int x) {

    if(x > 0 && x < 100 ) {
      return x;
    }else {
      return -1;
    }    
  }

  public int getUlx() {
    return ulx;
  }

  public void setUlx(int ulx) {
    this.ulx = ulx;
  }

  public int getUly() {
    return uly;
  }

  public void setUly(int uly) {
    this.uly = uly;
  }

  public int getLrx() {
    return lrx;
  }

  public void setLrx(int lrx) {
    this.lrx = lrx;
  }

  public int getLry() {
    return lry;
  }

  public void setLry(int lry) {
    this.lry = lry;
  }
}


public class ex01 {

  public static void main(String[] args) {

    Rectangle rec = new Rectangle();
    rec.ulx = 22; rec.uly = 22;
    rec.lrx = 10; rec.lry = 10;
    rec.showArea();

    Rectangle rectagle = new Rectangle();

    rectagle.getLrx()
  }



}
