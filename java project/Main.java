import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame();//bcz frame has different functions

        frame.setTitle("First frame application");//put titile into frame
        frame.setVisible(true);//set frame visible
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//manually close the window
        frame.getContentPane().setBackground(new Color (255,54,213));//AWT combine
        //frame.getContentPane().setBackground(Color.ORANGE);

        JLabel lebel = new JLabel();//create leabel object
        lebel.setText("Hello World");//create and add Value to Label
        lebel.setHorizontalAlignment(JLabel.CENTER);
        lebel.setVerticalAlignment(JLabel.TOP);
        lebel.setForeground(Color.blue);
        
        Border border = BorderFactory.createLineBorder(Color.GREEN); 
        //default border has full frame in size we can handle it
        lebel.setBorder(border);// assign border to frame 

        

        frame.add(lebel);

    }
}//press ctrl + c to manual close the hided window or use setDefaultCloseOperation option to handle it.