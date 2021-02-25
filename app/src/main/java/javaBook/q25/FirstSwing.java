package javaBook.q25;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwing {
  public static void main(String[] args) {

    JFrame frm = new JFrame("First Swing");
    frm.setBounds(120, 200, 400, 100);
    frm.setLayout(new FlowLayout());

    JButton btn1 = new JButton ("My Button");
    JButton btn2 = new JButton ("your Button");
    JButton btn3 = new JButton ("Our Button");

    frm.add(btn1);
    frm.add(btn2);
    frm.add(btn3);
    frm.setVisible(true);
  }

}


