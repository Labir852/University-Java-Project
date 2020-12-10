
 import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class NewClass  {

private static JLabel label;
public static void main (String[] args){

    JFrame frame = new JFrame("ExETesT");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,350);
    JPanel panel = new JPanel ();
    frame.add(panel);
    JButton button = new JButton("Click me");
    panel.add(button);
    label = new JLabel();
    panel.add(label);
    button.addActionListener(new Action());

}
    static class Action implements ActionListener{

        public void actionPerformed (ActionEvent e){
            String[] name1 = {"PHYSICS", "CHEMISTRY", "MATHEMATICS", "BIOLOGY", "ENGLISH"};
            String[] name2 = {"1st", "2nd", "3rd", "4th","5th"};
            String[] name3 = {"1", "2", "3","4", "5"};

            int random = (int) (Math.random()*name1.length);
            int random2 = (int) (Math.random()*name2.length);
            int random3 = (int) (Math.random()*name3.length);

            label.setText("Your clan name is: "  + name1[random] +" "+ name2[random2] +" "+ name3[random3]);

        }
    }
}   

