package co.edu.uptc.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventActions implements ActionListener {

    private Dialog2 dialog1;
    private Dialog3 dialog3;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("salir")){
            showDialog1();
        }
        if (command.equals("entrar")){
            showDialog3();
        }
    }

    private void showDialog1(){
        if (dialog1==null){
            dialog1 =new Dialog2();
        }
        dialog1.setVisible(true);
    }

    private void showDialog3(){
        if (dialog3==null){
            dialog3 =new Dialog3();
        }
        dialog3.setVisible(true);
    }
    
    
}
