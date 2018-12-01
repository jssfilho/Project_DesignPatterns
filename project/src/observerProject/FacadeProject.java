/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;

import bridgeProject.*;

/**
 *
 * @author Joao Santos
 */
public class FacadeProject {
  
   
    
    
    public UsuarioSujeito uG(String nome, String senha){
        UsuarioSujeito c = new Cliente();
        c.setEmail("j_ssfilho@hotmail.com");
        c.setSenha("1234");
        c.setTipo(false);
  
        UsuarioSujeito f = new Fornecedor();
        f.setTipo(true);
        f.setEmail("joao.santos@academico.ifpb.edu.br");
        f.setSenha("1234");
        
        UsuarioSujeito u = null;
        if(c.getEmail().equals(nome) && c.getSenha().equals(senha)){
            u = c;
        }else if(f.getEmail().equals(nome) && f.getSenha().equals(senha)){
            u = f;
        }else{
            System.out.println("Usuario não encontrado");
        }
        
        return u;
    }
   
}
