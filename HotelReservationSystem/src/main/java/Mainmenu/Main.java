package Mainmenu;


import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;


public class Main {
    public static void main(String[] args) {
         FlatDarkLaf.setup();
            UIManager.put("Button.arc", 20);
            UIManager.put("Component.arc", 20);
            UIManager.put("TextComponent.arc", 20);
            
            new SignUp().setVisible(true);
         
    }
}
    