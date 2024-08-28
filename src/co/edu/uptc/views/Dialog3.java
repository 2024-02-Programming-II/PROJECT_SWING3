package co.edu.uptc.views;

import javax.swing.JDialog;
import javax.swing.JTextField;

public class Dialog3 extends JDialog {

    public Dialog3() {
        setTitle("dialog 3");
        setLayout(null);
        setBounds(200, 10, 300, 300);
     JTextField jt = new JTextField();
     jt.setBounds(20,20,100,30);
     this.add(jt);
    }
}
