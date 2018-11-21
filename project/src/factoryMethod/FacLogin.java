/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author Joao Santos
 */
public class FacLogin extends FacDefault{

    @Override
    public Parent getCena() {
        Parent root=null; 
        try {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FacLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return root;
    }
    
}
