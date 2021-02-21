package javaBook.q07;

class child{

  int bead;

  public child(int p_bead) {

    this.bead = p_bead;
  }

  public void gameWin(int p_bead) {

    this.bead += p_bead;

  }

  public int gameLose(int p_bead) {

    this.bead -=p_bead;

    return p_bead;
  }


  public String beadTotal() {

    return this.bead+"개";
  }

}

public class Exam012 {
  public static void main(String[] args) {

    child child1 = new child(15);
    child child2 = new child(9);

    child1.gameWin(child2.gameLose(2));
    child2.gameWin(child1.gameLose(7));


    System.out.println("어린이 1 구슬 : "+child1.beadTotal());
    System.out.println("어린이 2 구슬 : "+child2.beadTotal());
  }

}
