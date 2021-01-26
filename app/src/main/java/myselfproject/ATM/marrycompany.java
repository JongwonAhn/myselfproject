package myselfproject.ATM;

public class marrycompany {

  public static void main(String[] args) {

    int tall=169;
    int weight=70;
    int footsize=245;
    String name="안종원";

    myphsical mc=new myphsical(tall,weight,footsize,name);
    myphsical mc1=new myphsical(150,70,200,"홍길동");
    myphsical mc2=new myphsical();

    mc2.myInfo();

    mc2.setName("안종원");

    mc2.myInfo();

    mc2.setTall(170);

    mc2.myInfo();

    mc2.setWeight(55);

    mc2.myInfo();

    System.out.println("나의 키는 "+mc2.getTall()+"입니다.");

  }




}
