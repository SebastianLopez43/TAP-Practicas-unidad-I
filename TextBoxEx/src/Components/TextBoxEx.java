package Components;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.*;

/**
 * @author José Sebastian López Ibarra 
 * Monday March 27 2023
 */

public class TextBoxEx extends JTextField {
    
    // Inicializada en blanco.
    private Color originalColor = Color.green;
    
    public TextBoxEx() {
        super();
        
        FocusAdapter fa = new FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                txtTextBoxExFocusGained(evt);
            }
            
            public void focusLost(FocusEvent evt) {
                txtTextBoxExFocusLost(evt);
            }
        };
        
        addFocusListener(fa);    
        
        
    }         
    
    private boolean ChangeColor = false;
    
    public boolean getChangeColor() {
        return ChangeColor;
    }

    public void setChangeColor(boolean ChangeColor) {
        this.ChangeColor = ChangeColor;
    }
    
    private void txtTextBoxExFocusGained(FocusEvent evt) {
        if (getChangeColor()) {
            originalColor = getBackground();
            setBackground(Color.red);
        } else {
            setBackground(originalColor);
        }
    }
    
    private void txtTextBoxExFocusLost(FocusEvent evt) {
        setBackground(originalColor);
    }                  
}
