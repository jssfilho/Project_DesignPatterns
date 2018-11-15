/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/*
 * Singleton
 * @author Joao Santos
 */
public class SingletonConexao {
    private static SingletonConexao cone;
    
    
    /* resto do codigo*/
    
    
    
    
    
    
    
    
    public SingletonConexao getInstance(){
        if(SingletonConexao.cone==null){
            SingletonConexao.cone = new SingletonConexao();
            return SingletonConexao.cone;
        }
        return SingletonConexao.cone;
    }
}
