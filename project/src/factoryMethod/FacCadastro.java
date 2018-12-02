/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Joao Santos
 */
public class FacCadastro extends FacDefault {

    @Override
    public PaginaInicial getCena() {
        PaginaInicial root=null; 
        try {
            root = new Cadastro();
        } catch (IOException ex) {
            Logger.getLogger(FacCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return root;
    }
    
}
