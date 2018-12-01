/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;

import java.util.ArrayList;

/**
 *
 * @author Joao Santos
 */
public abstract class Sujeito {
    protected ArrayList<View> observadores = new ArrayList();
    public void add(View ob){
        this.observadores.add(ob);
    }
    public void rem(View ob){
        this.observadores.remove(ob);
    }
    public void notifique(){
        for(Observador ob: this.observadores){
            ob.update();
        }
    }
}
