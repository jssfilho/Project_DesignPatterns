/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;

import java.util.ArrayList;

/**
 *
 * @author j_ssf
 */
public abstract class Sujeito {
    protected ArrayList<Observador> observadores;
    
    public void add(Observador ob){
        this.observadores.add(ob);
    }
    public void rem(Observador ob){
        this.observadores.remove(ob);
    }
    public void notifique(){
        for (Observador ob: this.observadores){
            ob.update();
        }
    }
}
