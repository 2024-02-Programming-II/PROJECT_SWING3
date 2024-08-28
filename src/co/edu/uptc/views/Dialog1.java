package co.edu.uptc.views;

import javax.swing.JDialog;

public class Dialog1 extends JDialog {
    
    public Dialog1(DashBoard db){
        super(db,true);
        setTitle("dialog1");
        setBounds(10,10,300,300);
        
    }
}
