package co.edu.uptc.views;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.w3c.dom.css.RGBColor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame {
    private Dialog1 dialog1;


   public DashBoard(){
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
    jButton.setText("Dialog1");
    jButton.setBounds(40,40,100,30);
    this.add(jButton);
    jButton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            showDialog1();
        }
        
    });

   }

private void showDialog1(){
    if (dialog1==null){
        dialog1 =new Dialog1(this);
    }
    dialog1.setVisible(true);
}


   private void addButtonDialog2(){
    JButton jButton = new JButton();
    jButton.setText("Dialog2");
    jButton.setBounds(40,100,100,30);
    this.add(jButton);
   }



}
