package myselfproject.ATM;

public class myphsical {

  String name;
  int tall;
  int weight;
  int footsize;

  public myphsical(int tall,int weight,int footsize, String name){

    this.tall=tall;
    this.weight=weight;
    this.footsize=footsize;
    this.name=name;

  }

  public myphsical(){

    this.tall=0;
    this.weight=0;
    this.footsize=0;
    this.name="??";

  }


  public void myInfo() {
    System.out.println("이름:"+name+" 키:"+tall +" 몸무게:"+weight+" 발 사이즈:"+footsize);
  }

  public void setName(String name) {
    this.name=name;
  }
  public void setTall(int tall) {
    this.tall=tall;
  }
  public void setWeight(int weight) {
    this.weight=weight;
  }
  public void setFootzie(int footsize) {
    this.footsize=footsize;
  }

  public String getName() {
    return this.name;

  }
  public int getTall() {
    return this.tall;

  }
  public int getWeight() {
    return this.weight;
  }
  public int getFootsize() {
    return this.footsize;
  }





}










