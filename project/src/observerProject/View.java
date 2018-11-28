/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;
import abstractFactoryProject.*;

import javafx.scene.Parent;

/**
 *
 * @author Joao Santos
 */
public class View extends Parent implements Observador{
    private UsuarioSujeito ob = null;
    
    /*
        Definir os dados observados
    */
    public View(){
        
    }
    
    @Override
    public void update() {
        
    }

    public UsuarioSujeito getOb() {
        return ob;
    }

    public void setOb(UsuarioSujeito ob) {
        this.ob = ob;
    }
}
