package myselfStudy.study01;

import java.util.ArrayList;

public class testSource {

  private String title;
  private String content="";
  private ArrayList<String> header=new ArrayList<>();
  private ArrayList<String> table=new ArrayList<>();
  private int num=0;
  private int row=0;

  public testSource title(String title) {
    this.title=title;
    return this;
  }
  public void titleHtml() {
    System.out.println(this.title);
  }
  public testSource th(String th) {
    header.add(num, th);
    num++;
    return this;

  }
  public void thHtml() {
    String out="";
    for(int i=0; i<header.size(); i++) {

      out += " " + header.get(i)+" | ";
    }
    System.out.println("------------------------");
    System.out.println(out);
    System.out.println("------------------------");

    num=0;
  }

  public testSource content(String content) {
    this.content+=content+"|";
    return this;
  }
  public void end() {
    table.add(row, this.content);
    row++;
    this.content="";
  }

  public void tdHtml() {
    for(int i=0; i<table.size(); i++) {
      System.out.println(table.get(i));
    }
  }



}
