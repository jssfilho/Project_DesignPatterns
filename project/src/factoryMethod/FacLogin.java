/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;



/**
 *
 * @author Joao Santos
 */
public class FacLogin extends FacDefault{

    @Override
    public PaginaInicial getCena() {
        PaginaInicial root=new Login(); 
    
        return root;
    }
    
}
