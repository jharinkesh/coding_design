package com.research;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frames extends Frame implements ActionListener {

  final Label l1 = new Label("0");
  Button b1 = new Button("press");
  boolean state;

  frames() {
    setVisible(true);
    setResizable(false);
    setLocation(400, 200);
    setSize(200, 250);
    setLayout(null);
    // ImageIcon icon = new ImageIcon("images/1.jg");
    // l1.setIcon(icon);
    l1.setBounds(5, 0, 190, 190);
    l1.setFont(new Font("Ariel", Font.BOLD, 120));
    b1.setBounds(5, 191, 190, 30);
    add(l1);
    add(b1);
    b1.addActionListener(this);
  }

  public static void main(String[] args) {
    new frames();
  }

  public void actionPerformed(ActionEvent e) {
    new Thread(new Runner(l1)).start();
  }

}


class Runner implements Runnable {
  Label l1;

  Runner(Label l1) {
    this.l1 = l1;
  }

  public void run() {
    for (int i = 1; i < 16; i++) {
      l1.setText(i + "");
      try {
        Thread.sleep(100);
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
    }
  }
}
