package Windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author José Sebastian López Ibarra
 * Monday February 13 2023
 */

public class Pagina_Recta extends JPanel {
    JTextField txt_distance;
    JLabel lbl_point1, lbl_point2;
    JPanel panelPrincipal, panelButtonNorth, panelButtonSouth, panelCenter;
    JButton btn_prinWin, btn_win1, btn_win2, btn_distance;
    
    public Pagina_Recta() {        
        lbl_point1 = new JLabel("Punto 1: ");    
        lbl_point1.setSize(120, 30);
        lbl_point1.setFont(new Font("Calibri", 2, 24));
        
        lbl_point2 = new JLabel("Punto 2: ");      
        lbl_point2.setSize(120,30);
        lbl_point2.setFont(new Font("Calibri", 2, 24));
        
        txt_distance = new JTextField();
        txt_distance.setEnabled(false);                
        
        Distancia_Recta.Recta distance = new Distancia_Recta.Recta();
        
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
        
        btn_distance = new JButton();
        btn_prinWin.setSize(180, 30);
        btn_prinWin.setFont(new Font("Georgia", 2, 14));
        
        btn_distance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*double d = distance.distanBetweenPoints(points.getX(), points.getY(), points.getX1(), points.getY1());
                String str = String.valueOf(d);
                    
                txt_distance.setText("La distancia es: " + str);*/
            }
        });
        
        panelButtonNorth = new JPanel();
        panelButtonNorth.setBackground(new Color(210, 105, 30));
        panelButtonNorth.add(btn_prinWin);
        panelButtonNorth.add(btn_win1);
        panelButtonNorth.add(btn_win2);
        
        panelButtonSouth = new JPanel();
        panelButtonSouth.setBackground(new Color(210, 105, 30));
        panelButtonSouth.add(btn_distance);
        
        panelCenter = new JPanel();
        panelCenter.setBackground(new Color(119, 136, 153));
        panelCenter.add(lbl_point1);
        panelCenter.add(lbl_point2);
        
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(72, 209, 204));
        panelPrincipal.setLayout(new BorderLayout());        
        panelPrincipal.add(panelButtonNorth, BorderLayout.NORTH);
        panelPrincipal.add(panelButtonSouth, BorderLayout.SOUTH);     
        panelPrincipal.add(panelCenter, BorderLayout.CENTER);
        
        this.setBackground(new Color(32, 178, 170));
        this.setLayout(new BorderLayout());        
        this.add(panelPrincipal);
    }
    
    private void showWindows(JPanel window) {
        window.setSize(800, 700);
        window.setLocation(0, 0);
        
        panelPrincipal.removeAll();
        panelPrincipal.add(window, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
}
