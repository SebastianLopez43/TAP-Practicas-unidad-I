package Components;

import java.awt.event.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

/**
 * @author José Sebastian López Ibarra
 * Wednesday April 19 2023
 */

public class TextBox extends JTextField {
    
    public TextBox() {
        
        super();

        FocusAdapter fl = new FocusAdapter() {
            
            public void focusGained(FocusEvent evt) {
                jtfTextBoxFocusGained(evt);
            }
            
            public void focusLost(FocusEvent evt) {
                jtfTextBoxFocusLost(evt);
            }

            private void jtfTextBoxFocusGained(FocusEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void jtfTextBoxFocusLost(FocusEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        addFocusListener(fl);
    }
}
