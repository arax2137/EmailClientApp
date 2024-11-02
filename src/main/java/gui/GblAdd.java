package gui;

import javax.swing.*;
import java.awt.*;

public class GblAdd {
    public static void add(JComponent component, JPanel panel, GridBagLayout layout, GridBagConstraints gbc, int gridx, int gridy, int gridwidth, int gridheigth){

        gbc.gridx = gridx;
        gbc.gridy = gridy;

        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheigth;

        gbc.fill = GridBagConstraints.BOTH;

        layout.setConstraints(component, gbc);
        panel.add(component);
    }

}

