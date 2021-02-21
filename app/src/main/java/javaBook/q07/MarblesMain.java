package javaBook.q07;

class ChildProperty
{
  int numOfBead;

  public ChildProperty(int bead) {

    numOfBead = bead;

  }

  public void obtainBead(ChildProperty child, int obtainCount) {

    int obatinBeadCount = child.loseBead(obtainCount);
    numOfBead += obatinBeadCount;

  }

  public int loseBead(int loseCount) {

    if(numOfBead<loseCount) {

      int retValue = numOfBead;
      numOfBead = 0;
      return retValue;
    }

    numOfBead -= loseCount;
    return loseCount;

  }

  public void showProperty() {

    System.out.println("보유 구슬의 갯수"+ numOfBead);
  }
}

public class MarblesMain {

  public static void main(String[] args) {

    ChildProperty child1 = new ChildProperty(15);
    ChildProperty child2 = new ChildProperty(9);

    // 게임전 구슬 보유의 갯수
    // 어린이1
    child1.showProperty();
    //어린2ㅣ2
    child2.showProperty();

    //    1차게임 어린1은 어린이 2의 구슬 2개 획득 


    child1.obtainBead(child2, 2);
    child2.obtainBead(child1, 7);
    //    개임후
    child1.showProperty();
    child2.showProperty();
  }


}
