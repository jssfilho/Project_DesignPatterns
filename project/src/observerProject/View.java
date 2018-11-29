/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;
import bridgeProject.UsuarioSujeito;
import abstractFactoryProject.*;

import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Joao Santos
 */
public class View extends Scene implements Observador{
    private SujeitoConcreto sC;
    private UsuarioSujeito ob = null;
    
    /*
        Definir os dados observados
    */

    public View(Parent root) {
        super(root);
    }
    
    
    @Override
    public void update() {
        sC.getU();
    }

    public UsuarioSujeito getOb() {
        return ob;
    }

    public void setOb(UsuarioSujeito ob) {
        this.ob = ob;
    }
}
