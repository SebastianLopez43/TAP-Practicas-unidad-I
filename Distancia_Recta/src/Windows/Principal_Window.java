package Windows;

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
    JPanel panelPrincipal, panelButtonNorth, panelButtonSouth, panelCenter;
    JButton btn_prinWin, btn_win1, btn_win2;
    
    public Principal_Window() {
        btn_prinWin = new JButton("Inicio");
        btn_prinWin.setSize(180, 30);
        btn_prinWin.setFont(new Font("Georgia", 2, 14));
        
        btn_prinWin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Principal_Window().setVisible(true);
            }
        });
        
        btn_win1 = new JButton("Crear Puntos");
        btn_win1.setSize(180, 30);
        btn_win1.setFont(new Font("Georgia", 2, 14));
        
        btn_win1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Puntos());
            }
        });
        
        btn_win2 = new JButton("Crear Recta");
        btn_win2.setSize(180, 30);
        btn_win2.setFont(new Font("Georgia", 2, 14));
        
        btn_win2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Recta());
            }
        });
        
        panelButtonNorth = new JPanel();
        panelButtonNorth.setBackground(new Color(210, 105, 30));
        panelButtonNorth.add(btn_prinWin);
        panelButtonNorth.add(btn_win1);
        panelButtonNorth.add(btn_win2);
        
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(72, 209, 204));
        panelPrincipal.setLayout(new BorderLayout());        
        panelPrincipal.add(panelButtonNorth, BorderLayout.NORTH);
        
        this.setSize(800, 700);
        this.setLocation(160, 15);
        this.setLayout(new BorderLayout());        
        this.add(panelPrincipal);
        this.getContentPane().setBackground(new Color(32, 178, 170));     
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void showWindows(JPanel window) {
        window.setSize(800, 700);
        window.setLocation(0, 0);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(window, BorderLayout.CENTER);                               
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    public static void main(String[] args) {
        new Principal_Window().setVisible(true);
    }
}
