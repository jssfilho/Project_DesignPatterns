/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Joao Santos
 */
public class FacAdm extends Factory{

    @Override
    public Configuracoes getConfig() {
        Configuracoes root =null; 
        try {
            root = new ConfigAdm();
        } catch (IOException ex) {
            Logger.getLogger(FacAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        return root;
    }

    @Override
    public Home getHome() {
        Home root=null; 
        try {
            root = new HomeAdm();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(FacAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return root;
    }
    
}
