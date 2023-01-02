package mib.projekt;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;   
import javax.swing.JTextField;

public class Validering {
    
    
    public static boolean lösenordetÄrLång(JPasswordField lösenordet){
        
        boolean resultat = true;
        char[] lösenord = lösenordet.getPassword();
        if(lösenord.length>6){
            JOptionPane.showMessageDialog(null, "Lösenord får inte vara mer än 6 karaktärer!");
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean endastNummerTillåten(JTextField telefon){
        
        boolean resultat = true;
        if (telefon.getText().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(null, "Endast siffror tillåtna!");
            resultat=false;
        }
        return resultat;
    }
    
}
