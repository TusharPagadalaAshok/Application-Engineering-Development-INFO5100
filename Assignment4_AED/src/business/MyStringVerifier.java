package business;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Tushar
 */
public class MyStringVerifier extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        String pattern = "^[a-zA-Z0-9]*$";
        if (text.length() > 0) {
            if (text.toLowerCase().startsWith(" ") || text.length() == 0 ||
                    text.matches(pattern) != true) {
               
                JOptionPane.showMessageDialog(input, "Please enter valid string", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                
                return true;
            }
        }
        else
        {
            
            return true;
        }
    }
}
