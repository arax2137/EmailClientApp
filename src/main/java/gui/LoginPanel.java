package gui;

import javax.swing.*;
import java.awt.*;


public class LoginPanel extends JPanel {

    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JTextField passwordField;

    public LoginPanel(){
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        setPreferredSize(new Dimension(800,400));

        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField("");
        passwordField = new JTextField("");

        GblAdd.add(usernameLabel, this, layout, gbc, 0, 0, 1,1);
        GblAdd.add(passwordLabel, this, layout, gbc, 0, 1, 1,1);
        GblAdd.add(usernameField, this, layout, gbc, 1, 0, 3,1);
        GblAdd.add(passwordField, this, layout, gbc, 1, 1, 3,1);


    }
}
