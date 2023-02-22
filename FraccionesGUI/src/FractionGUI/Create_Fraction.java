package FractionGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Propietario
 */

public class Create_Fraction extends JPanel {
    JTextField txt_numerador1, txt_denominador1, txt_numerador2, txt_denominador2;
    JLabel title, lbl_fract1, lbl_fract2, lbl_numerador1, lbl_denominador1, lbl_numerador2, lbl_denominador2, lbl_image;
    JButton btn_create, btn_clean;
    
    // Creamos objeto de la clase fracción, la cual contiene todos los atributos.
    FractionGUI.Fraction fraction = FractionGUI.General.fraction;
    
        public Create_Fraction() {
            title = new JLabel("Crear fracciones");        
        
            lbl_fract1 = new JLabel("Primer Fracción");
            lbl_numerador1 = new JLabel("Numerador");
            lbl_denominador1 = new JLabel("Denominador");
            lbl_fract2 = new JLabel("Segunda Fracción");
            lbl_numerador2 = new JLabel("Numerador");
            lbl_denominador2 = new JLabel("Denominador");
            lbl_image = new JLabel();

            txt_numerador1 = new JTextField();
            txt_denominador1 = new JTextField();
            txt_numerador2 = new JTextField();
            txt_denominador2 = new JTextField();

            btn_create = new JButton("Crear fracción");
            btn_clean = new JButton("Limpiar campos");

            this.setLayout(null);

            // Agregamos todos los elementos creados con anterioridad.
            this.add(title);
            this.add(lbl_fract1);
            this.add(lbl_fract2);
            this.add(lbl_numerador1);
            this.add(lbl_denominador1);
            this.add(lbl_numerador2);
            this.add(lbl_denominador2);
            this.add(txt_numerador1);
            this.add(txt_denominador1);
            this.add(txt_numerador2);
            this.add(txt_denominador2);
            this.add(btn_create);
            this.add(btn_clean);

            // Damos formato a los componentes
            title.setBounds(290, 0, 300, 200);
            title.setFont(new Font("Calibri", Font.BOLD, 36));
            title.setForeground(Color.white);
            
            lbl_fract1.setBounds(120, 150, 200, 30);
            lbl_fract1.setFont(new Font("Calibri", 2, 30));
            lbl_fract1.setForeground(Color.white);
            lbl_numerador1.setBounds(125, 195, 120, 30);
            lbl_numerador1.setFont(new Font("Calibri", 2, 24));
            lbl_numerador1.setForeground(Color.white);
            lbl_denominador1.setBounds(125, 255, 160, 30);
            lbl_denominador1.setFont(new Font("Calibri", 2, 24));
            lbl_denominador1.setForeground(Color.white);
            
            lbl_fract2.setBounds(120, 320, 260, 30);
            lbl_fract2.setFont(new Font("Calibri", 2, 30));
            lbl_fract2.setForeground(Color.white);
            lbl_numerador2.setBounds(125, 375, 120, 30);
            lbl_numerador2.setFont(new Font("Calibri", 2, 24));
            lbl_numerador2.setForeground(Color.white);
            lbl_denominador2.setBounds(125, 435, 160, 30);
            lbl_denominador2.setFont(new Font("Calibri", 2, 24));
            lbl_denominador2.setForeground(Color.white);

            lbl_image.setBounds(480, 225, 230, 190);
            ImageIcon image = new ImageIcon(getClass().getResource("/Images/fraction.png"));
            ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_DEFAULT));
            lbl_image.setIcon(icon);
            this.add(lbl_image);

            txt_numerador1.setBounds(300, 195, 100, 30);
            txt_numerador1.setForeground(Color.BLACK);
            txt_numerador1.setBackground(Color.white);
            txt_denominador1.setBounds(300, 255, 100, 30);
            txt_denominador1.setForeground(Color.BLACK);
            txt_denominador1.setBackground(Color.white);
            txt_numerador2.setBounds(300, 375, 100, 30);
            txt_numerador2.setForeground(Color.BLACK);
            txt_numerador2.setBackground(Color.white);
            txt_denominador2.setBounds(300, 435, 100, 30);
            txt_denominador2.setForeground(Color.BLACK);
            txt_denominador2.setBackground(Color.white);

            // Aplicamos funcionalidades a los botones
            // Botón que crea las fracciones
            btn_create.setBounds(180, 540, 170, 30);
            btn_create.setFont(new Font("Georgia", 2, 14));
            btn_create.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        fraction.setNumerador1(Integer.parseInt(txt_numerador1.getText()));
                        fraction.setDenominador1(Integer.parseInt(txt_denominador1.getText()));
                        fraction.setNumerador2(Integer.parseInt(txt_numerador2.getText()));
                        fraction.setDenominador2(Integer.parseInt(txt_denominador2.getText()));

                        JOptionPane.showMessageDialog(locate(320, 235), "Se han creado las fracciones, da clic en la página 'Operaciones'");

                        txt_numerador1.setText("");
                        txt_denominador1.setText("");
                        txt_numerador2.setText("");
                        txt_denominador2.setText("");
                    } catch (Exception ex) {
                        // Mensaje que aparece en caso de una excepción.
                        JOptionPane.showMessageDialog(locate(320, 235), "Por favor, rellena todos los campos.");
                    }
                }
            });
            
            // Botón que limpia los campos
            btn_clean.setBounds(440, 540, 170, 30);
            btn_clean.setFont(new Font("Georgia", 2, 14));
            btn_clean.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_numerador1.setText("");
                        txt_denominador1.setText("");
                        txt_numerador2.setText("");
                        txt_denominador2.setText("");
                }
            });

            this.setBounds(150, 15, 800, 700);
            this.setBackground(new Color(221, 141, 46));
        }
}
