package myselfStudy.study01;

public class study3 {

  final static int WON = 1000;

  public static int give(int money) {

    money -= 500;

    return bank(money);
  }

  public static int bank(int money) {

    return money/10;

  }

  public static void main(String[] args) {

    int pokect = give(WON);

    System.out.println(pokect);



  }
}
