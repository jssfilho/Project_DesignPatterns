/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


/**
 *
 * @author Joao Santos
 */
public class FacCliente extends Factory{
    
    
    @Override
    public Configuracoes getConfig() {
        Configuracoes root=null; 
        try {
            root = FXMLLoader.load(getClass().getResource("ConfigUsu.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FacCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return root;
    }

    @Override
    public Home getHome() {
        Home root=null; 
        try {
            root = FXMLLoader.load(getClass().getResource("HomeUsu.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FacCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return root;
    }
    
}
