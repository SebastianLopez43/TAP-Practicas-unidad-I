package FractionGUI;

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
 * Tuesday February 21 2023
 */

public class Fraction_Operations extends JPanel {
    JTextField txt_fract1, txt_fract2, txt_result;
    JLabel lbl_title, lbl_fract1, lbl_fract2, lbl_formule, lbl_result;
    JButton btn_addition, btn_subtraction, btn_multiplication, btn_division, btn_delete;
          
    FractionGUI.Fraction fraction1 = FractionGUI.General.fraction;
    FractionGUI.Fraction fraction2 = FractionGUI.General.fraction;
    FractionGUI.Operation operation = FractionGUI.General.operations;    
    
        public Fraction_Operations() {
            lbl_title = new JLabel("Operaciones con fracciones");
            lbl_fract1 = new JLabel("Fracción 1");
            lbl_fract2 = new JLabel("Fracción 2");
            lbl_result = new JLabel("Resultado:");

            txt_fract1 = new JTextField();
            txt_fract2 = new JTextField();
            txt_result = new JTextField();
            
            btn_addition = new JButton("Suma");
            btn_subtraction = new JButton("Resta");
            btn_multiplication = new JButton("Multiplicación");
            btn_division = new JButton("Division");
            btn_delete = new JButton("Borrar datos");            

            this.setLayout(null);

            // Agregamos los componentes previamente creados
            this.add(lbl_title);
            this.add(lbl_fract1);
            this.add(lbl_fract2);
            this.add(lbl_result);            
            this.add(txt_fract1);
            this.add(txt_fract2);
            this.add(txt_result);
            this.add(btn_addition);
            this.add(btn_subtraction);
            this.add(btn_multiplication);
            this.add(btn_division);
            this.add(btn_delete);
            
            // Damos formato a los componentes
            lbl_title.setBounds(180, -40, 420, 200);
            lbl_title.setFont(new Font("Calibri", 2, 36));
            lbl_title.setForeground(Color.white);
            lbl_fract1.setBounds(90, 160, 300, 30);
            lbl_fract1.setFont(new Font("Calibri", 2, 26));
            lbl_fract1.setForeground(Color.white);
            lbl_fract2.setBounds(280, 160, 300, 30);
            lbl_fract2.setFont(new Font("Calibri", 2, 26));
            lbl_fract2.setForeground(Color.white);
            lbl_result.setBounds(490, 160, 500, 30);
            lbl_result.setFont(new Font("Calibri", 2, 26));
            lbl_result.setForeground(Color.white);
            
            txt_fract1.setBounds(90, 220, 100, 30);
            txt_fract1.setFont(new Font("Calibri", 2, 24));
            txt_fract1.setForeground(Color.black);
            txt_fract1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            txt_fract1.setText(fraction1.getNumerador1() + "/" + fraction1.getDenominador1());
            txt_fract2.setBounds(280, 220, 100, 30);
            txt_fract2.setFont(new Font("Calibri", 2, 24));
            txt_fract2.setForeground(Color.black);
            txt_fract2.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            txt_fract2.setText(fraction2.getNumerador2() + "/" + fraction2.getDenominador2());
            txt_result.setBounds(490, 220, 100, 30);
            txt_result.setFont(new Font("Calibri", 2, 24));
            txt_result.setForeground(Color.black);
            txt_result.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            
            // Botón que realiza la suma de fracciones
            btn_addition.setBounds(90, 400, 180, 30);
            btn_addition.setFont(new Font("Georgia", 2, 14));
            btn_addition.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_result.setText(operation.sum(fraction1, fraction2));
                }
            });
            
            // Botón que realiza la resta de fracciones
            btn_subtraction.setBounds(280, 400, 180, 30);
            btn_subtraction.setFont(new Font("Georgia", 2, 14));
            btn_subtraction.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_result.setText(operation.subtraction(fraction1, fraction2));
                }
            });
            
            // Botón que realiza la multiplicación de fracciones
            btn_multiplication.setBounds(90, 460, 180, 30);
            btn_multiplication.setFont(new Font("Georgia", 2, 14));
            btn_multiplication.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_result.setText(operation.multiplication(fraction1, fraction2));
                }
            });
            
            // Botón que realiza la división de fracciones
            btn_division.setBounds(280, 460, 180, 30);
            btn_division.setFont(new Font("Georgia", 2, 14));
            btn_division.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt_result.setText(operation.division(fraction1, fraction2));
                }
            });

            // Botón que deja en ceros las fracciones
            btn_delete.setBounds(510, 435, 140, 30);
            btn_delete.setFont(new Font("Georgia", 2, 14));
            btn_delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fraction1.setNumerador1(0);
                    fraction1.setDenominador1(0);
                    fraction2.setNumerador2(1);
                    fraction2.setDenominador2(1);

                    txt_fract1.setText("");             
                    txt_fract2.setText("");                               
                    txt_result.setText("");               
                }
            });

            this.setBounds(150, 15, 800, 700);
            this.setBackground(new Color(196, 41, 104));
        }    
}