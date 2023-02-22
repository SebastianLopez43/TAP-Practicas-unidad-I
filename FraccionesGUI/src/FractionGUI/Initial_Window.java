package FractionGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author José Sebastian López Ibarra
 * Tuesday February 21 2023
 */

public class Initial_Window extends JPanel {
    // Creamos variables de tipo JLabel
    JLabel lbl_title1, lbl_title2, lbl_title3;
    
    public Initial_Window() {            
        lbl_title1 = new JLabel ("Aplicación que calcula las operaciones");
        lbl_title2 = new JLabel ("básicas de las fracciones.");
        lbl_title3 = new JLabel ("Realizada por Sebastian López ©2023");
        
        // Definimos el diseño y letra de cada etiqueta
        lbl_title1.setFont(new Font("Roboto", Font.BOLD, 24));
        lbl_title1.setForeground(new Color (255,255,255));
        lbl_title1.setBounds(40, 90, 600, 30);
        lbl_title2.setFont(new Font("Roboto", Font.BOLD, 24));
        lbl_title2.setForeground(new Color (255,255,255));
        lbl_title2.setBounds(40, 130, 600, 30);
        lbl_title3.setFont(new Font("Georgia", Font.BOLD, 14));
        lbl_title3.setForeground(new Color (255,255,255));
        lbl_title3.setBounds(190, 195, 300, 30);
        
        this.setBackground( new Color (54, 88, 255));
        this.setLayout(new BorderLayout());
        this.add(lbl_title1, BorderLayout.AFTER_LAST_LINE);
        this.add(lbl_title2, BorderLayout.AFTER_LAST_LINE);
        this.add(lbl_title3, BorderLayout.PAGE_END);
    }
}