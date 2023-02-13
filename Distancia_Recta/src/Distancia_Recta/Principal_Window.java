package Distancia_Recta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author José Sebastian López Ibarra
 * Monday February 13 2023
 */

public class Principal_Window extends JFrame {
    JPanel panelPrincipal;
    JPanel panelButtonNorth;
    JPanel panelButtonSouth;
    JPanel panelVentanas;
    JButton btn_win1, btn_win2;
    
    public Principal_Window() {
        btn_win1 = new JButton("Crear Puntos");
        btn_win1.setSize(180, 30);
        btn_win1.setFont(new Font("Georgie", 2, 14));
        btn_win1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Puntos());
            }
        });
        
        btn_win2 = new JButton("Crear Puntos");
        btn_win2.setSize(180, 30);
        btn_win2.setFont(new Font("Georgie", 2, 14));
        btn_win2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Recta());
            }
        });
        
        panelButtonNorth = new JPanel();
        
        this.setSize(800, 700);
        this.setLocation(160, 15);
        this.getContentPane().setBackground(new Color(0, 80, 255));     
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void showWindows(JPanel window) {
        window.setSize(800, 700);
        window.setLocation(0, 0);
        
        panelVentanas.removeAll();
        panelVentanas.add(window, BorderLayout.CENTER);
        panelVentanas.revalidate();
        panelVentanas.repaint();
    }
    
    public static void main(String[] args) {
        new Principal_Window().setVisible(true);
    }
}
