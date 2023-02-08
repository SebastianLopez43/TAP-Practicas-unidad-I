import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author José Sebastian López Ibarra
 * Thursday February 08 2023
 */

public class Fibonacci extends JFrame{
    JButton btn_uno;
    JButton btn_dos;
    
    JTextField txt_valor;
    JTextArea txa_resultado;
    
    JLabel lbl_valor;
    JLabel lbl_resultado;
    
    public Fibonacci() {
        super("Serie de Fibonacci.");        
        this.setLayout(null);                
        
        btn_uno = new JButton("Proceder");
        btn_uno.setBounds(100, 270, 140, 30);
        
        /*
        btn_uno.addActionListener(new ActionListener() {
            
        }); */
        
        btn_dos = new JButton("Salir");
        btn_dos.setBounds(360, 270, 140, 30);
        
        this.add(btn_uno);
        this.add(btn_dos);
        
        txt_valor = new JTextField();
        txt_valor.setVisible(true);
        txt_valor.setBounds(300, 100, 180, 30);

        txa_resultado = new JTextArea();
        txa_resultado.setVisible(true);
        txa_resultado.setBounds(300, 170, 180, 30);
        
        this.add(txt_valor);
        this.add(txa_resultado);
        
        lbl_valor = new JLabel("Introduzca una posición:");
        lbl_valor.setVisible(true);
        lbl_valor.setBounds(100, 100, 220, 30);
        
        lbl_resultado = new JLabel("Serie de Fibonacci:");
        lbl_resultado.setVisible(true);
        lbl_resultado.setBounds(100, 170, 220, 30);
        
        this.add(lbl_valor);
        this.add(lbl_resultado);
        
        this.setBounds(100, 100, 600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public static void main(String[] args) {
        new Fibonacci();
    }    
}