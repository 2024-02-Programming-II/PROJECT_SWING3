package co.edu.uptc.views;

import javax.swing.JFrame;
import javax.swing.JWindow;

import java.awt.Color;
import java.awt.Dimension;

public class DashBoard2  {
   JFrame jFrame;
   JWindow jWindow;

   public DashBoard2(){
    
   }

   public void run(){
      jFrame = new JFrame();
      Dimension dim = new Dimension(400,400);
      jFrame.setSize(dim);
      jFrame.setLocationRelativeTo(null);
      jFrame.getContentPane().setBackground(Color.red);
      jFrame.setVisible(true);
   }

   public void run2(){
      jWindow = new JWindow();
      Dimension dim = new Dimension(400,400);
      jWindow.setSize(dim);
      jWindow.setLocationRelativeTo(null);
      jWindow.getContentPane().setBackground(Color.red);
      jWindow.setVisible(true);
   }


}
