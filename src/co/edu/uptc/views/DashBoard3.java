package co.edu.uptc.views;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;

public class DashBoard3 extends JFrame {
    
   public DashBoard3(){
    Dimension dim = new Dimension(400,400);
    setSize(dim);
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.red); 
    setLayout(null);
    initComponents();
   }

   private void initComponents(){
    addButtonDialog1();
    addButtonDialog2();

   }

   private void addButtonDialog1(){
    JButton jButton = new JButton();
    jButton.setText("Dialog2");
    jButton.setBounds(40,40,100,30);
    this.add(jButton);
    jButton.setActionCommand("salir");
    EventActions eventActions = new EventActions();
    jButton.addActionListener(eventActions);
   }

   private void addButtonDialog2(){
    JButton jButton = new JButton();
    jButton.setText("Dialog3");
    jButton.setBounds(40,100,100,30);
    this.add(jButton);
    jButton.setActionCommand("entrar");
    EventActions eventActions = new EventActions();
    jButton.addActionListener(eventActions);
   }



}
