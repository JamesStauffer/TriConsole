import java.awt.*;
import javax.swing.*;
import java.io.*;

http://docs.oracle.com/javase/tutorial/uiswing/layout/spring.html
http://docs.oracle.com/javase/tutorial/uiswing/components/text.html
http://docs.oracle.com/javafx/2/ui_controls/text-field.htm

public class TriConsole extends JFrame {
    private JTextPane output;
    private JTextArea input;
    private JTextArea command;

    public TriConsole() {
        SpringLayout layout = new SpringLayout();
        getContentPane().setLayout(layout);

        JLabel ouputLabel = new JLabel("Ouput:");
        getContentPane().add(ouputLabel);
        output = new JTextPane();
        output.setEditable(false);
        JScrollPane outputScrollPane = new JScrollPane(output);
        getContentPane().add(outputScrollPane);
        

        input = new JTextArea(2, 80);
        command = new JTextArea(2, 80);

        getContentPane().add(new JLabel("Program Input:"));
        getContentPane().add(input);
        getContentPane().add(new JLabel("Command:"));
        getContentPane().add(command);

        layout.putContraints(SpringLayout.WEST, outputLabel, 5, SpringLayout.SOUTH, output);

        pack();
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new TriConsole();
    }
}
