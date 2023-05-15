
package acenta;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.UIManager;

public class Acenta {

 
    public static void main(String[] args) {
        
        
        try { 
        UIManager.setLookAndFeel(new FlatDarculaLaf()); 
    } catch(Exception ignored){}
        new Menu().setVisible(true);
    }
    
}
