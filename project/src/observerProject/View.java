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
public class View implements Observador{
    private UsuarioSujeito ob = null;
    private Parent parent;
    
    /*
        Definir os dados observados
    */
    
    
    
    @Override
    public void update() {
        
    }

    public UsuarioSujeito getOb() {
        return ob;
    }

    public void setOb(UsuarioSujeito ob) {
        this.ob = ob;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
}
