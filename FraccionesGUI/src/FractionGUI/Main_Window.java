package FractionGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author José Sebastian López Ibarra
 * Tuesday February 21 2023
 */

public class Main_Window extends JFrame {
    // Creamos variables de tipo JPanel y JButton.
    JPanel panelApp, panelButtons, panelWindows;
    JButton btn_mainWindow, btn_window1, btn_window2, btn_exit;
    
    public Main_Window() {       
        // Botón que nos direcciona a la página de inicio.
        btn_mainWindow = new JButton("Inicio");
        btn_mainWindow.setSize(180, 30);
        btn_mainWindow.setFont(new Font("Georgia", 2, 14));        
        btn_mainWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Initial_Window());
            }
        });
        
        // Botón que nos direcciona a la ventana para crear los quebrados.
        btn_window1 = new JButton("Fracciones");
        btn_window1.setSize(180, 30);
        btn_window1.setFont(new Font("Georgia", 2, 14));  
        btn_window1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                showWindows(new Create_Fraction());
            }
        });
        
        // Botón que nos direcciona a la ventana donde se realizan las operaciones.
        btn_window2 = new JButton("Operaciones");
        btn_window2.setSize(180, 30);
        btn_window2.setFont(new Font("Georgia", 2, 14)); 
        btn_window2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                showWindows(new Fraction_Operations());
            }
        });
        
        // Botón que cierra la aplicación.
        btn_exit = new JButton("Salir");
        btn_exit.setSize(180, 30);
        btn_exit.setFont(new Font("Georgia", 2, 14));        
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
                
        // Contenedor que guarda los botones previamente creados.
        panelButtons = new JPanel();
        panelButtons.setBackground(new Color(51, 214, 182));
        panelButtons.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelButtons.add(btn_mainWindow);
        panelButtons.add(btn_window1);
        panelButtons.add(btn_window2);        
        panelButtons.add(btn_exit);     
        
        // Contenedor que guarda las ventanas previamente creadas.
        panelWindows = new JPanel();
        panelWindows.setBackground(new Color(79, 38, 40));
        panelWindows.setLayout(new BorderLayout());                        
        
        // Contenedor que guarda.
        panelApp = new JPanel();
        panelApp.setBackground(new Color(255, 255, 255));
        panelApp.setLayout(new BorderLayout());
        panelApp.add(panelButtons, BorderLayout.NORTH);
        panelApp.add(panelWindows, BorderLayout.CENTER);
        
        // Iniciamos mostrando la página principal.
        showWindows(new Initial_Window());                        
        
        // Definimos el tamaño y posición de la ventana principal.
        this.setBounds(150, 15, 800, 700);         
        this.setLayout(new BorderLayout());
        this.add(panelApp, BorderLayout.CENTER); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Método que nos muestra el panel recibido en el contenedor panelWindow.
    private void showWindows(JPanel window){
        window.setSize(800, 700);
        window.setLocation(0, 0);
        
        panelWindows.removeAll();
        panelWindows.add(window, BorderLayout.CENTER);                               
        panelWindows.revalidate();
        panelWindows.repaint();
    }
    
    public static void main(String[] args) {        
        new Main_Window().setVisible(true);
    }
}