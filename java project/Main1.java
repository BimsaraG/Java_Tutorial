import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.LabelView;

class Main1 {

    public static void main(String[] args) {// in a Java class is to provide the entry point for the Java Virtual Machine (JVM) to start executing the program.
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        
        JLabel label = new JLabel();
        label.setText("My Test Jframe");

        frame.add(label);

    }
    
}
