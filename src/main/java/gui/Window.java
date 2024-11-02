package gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        super("Mail");
        setSize(1200,700);
        setMinimumSize(new Dimension(800,400));
        CardLayout layout = new CardLayout();
        setLayout(layout);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = ((JPanel) getContentPane());
        setContentPane(contentPane);
        contentPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        LoginPanel loginPanel = new LoginPanel();
        add("loginPanel", loginPanel);






        setVisible(true);
    }
}
