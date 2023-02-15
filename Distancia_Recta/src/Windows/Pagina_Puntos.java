package Windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author José Sebastian López Ibarra
 * Monday February 13 2023
 */

public class Pagina_Puntos extends JPanel{
    JTextField txt_point1, txt_point2, txt_x, txt_y, txt_x1, txt_y1;
    JLabel lbl_point1, lbl_point2, lbl_x, lbl_y, lbl_x1, lbl_y1;
    JPanel panelPrincipal, panelButtonNorth, panelButtonSouth, panelCenter, panelPunto;
    JButton btn_prinWin, btn_win1, btn_win2, btn_create, btn_clean;
    
    public Pagina_Puntos() {
        lbl_point1 = new JLabel("Punto 1");    
        lbl_point1.setSize(120, 30);
        lbl_point1.setFont(new Font("Calibri", 2, 24));
        
        lbl_point2 = new JLabel("Punto 2");      
        lbl_point2.setSize(120,30);
        lbl_point2.setFont(new Font("Calibri", 2, 24));                
        
        lbl_x = new JLabel("X");
        lbl_y = new JLabel("Y");
        lbl_x1 = new JLabel("X");
        lbl_y1 = new JLabel("Y");
        
        Distancia_Recta.Punto points = new Distancia_Recta.Punto();
        
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
        
        btn_win2 = new JButton("Crear Recta");
        btn_win2.setSize(180, 30);
        btn_win2.setFont(new Font("Georgia", 2, 14));
        
        btn_win2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Recta());
            }
        });
        
        btn_create = new JButton("Crear");
        btn_create.setSize(180, 30);
        btn_create.setFont(new Font("Georgia", 2, 14));
        
        btn_create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                                             
                try {
                    int x = Integer.parseInt(txt_x.getText());
                    int y = Integer.parseInt(txt_y.getText());
                    int x1 = Integer.parseInt(txt_x1.getText());
                    int y1 = Integer.parseInt(txt_y1.getText());
                    
                    points.setX(x);   
                    points.setX(y);   
                    points.setX(x1);   
                    points.setX(y1);                       
                } catch (Exception ex) {
                    // Mensaje que aparece en caso de una excepción.
                    JOptionPane.showMessageDialog(locate(210, 175), "Por favor, rellena todos los campos.");
                }
            }
        });
        
        btn_clean = new JButton("Limpiar");
        btn_clean.setSize(180, 30);
        btn_clean.setFont(new Font("Georgia", 2, 14));
        
        btn_clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_x.setText("");
                txt_y.setText("");
                txt_x1.setText("");
                txt_y1.setText("");
            }
        });
        
        btn_clean = new JButton();
        btn_clean.setSize(180, 30);
        btn_clean.setFont(new Font("Georgia", 2, 14));
        
        panelButtonNorth = new JPanel();
        panelButtonNorth.setBackground(new Color(210, 105, 30));
        panelButtonNorth.add(btn_prinWin);
        panelButtonNorth.add(btn_win1);
        panelButtonNorth.add(btn_win2);
        
        panelButtonSouth = new JPanel();
        panelButtonSouth.setBackground(new Color(210, 105, 30));
        panelButtonSouth.add(btn_create);
        panelButtonSouth.add(btn_clean);
        
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
