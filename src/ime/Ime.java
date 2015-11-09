/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ime;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author hotman
 */
//dbediter.Window
public class Ime extends JFrame{
  JTextField field=new JTextField();
  public static void main(String[] args){
    Ime ime;
    ime =new Ime();
    ime.disp();
  }
  public void disp(){
    setUndecorated(true);
    setBackground(new Color(0,0,0,0));
    setAlwaysOnTop(true);
    field = new JTextField() {
      @Override protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
        super.paintComponent(g);
      }
    };
    field.setOpaque(false);
    field.setBackground(new Color(0,0,0,0));

    setBounds(100,100,100,20);
    add(field);
    setVisible(true);
    setLocation(100,100);
  }
}
