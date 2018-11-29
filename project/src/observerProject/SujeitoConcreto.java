/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;
import bridgeProject.*;
/**
 *
 * @author j_ssf
 */
public class SujeitoConcreto extends Sujeito{
    public UsuarioSujeito u = null;
    public String viewAtual;
    public UsuarioSujeito getU(){
        return u;
    }
    public void setU(UsuarioSujeito u){
        this.u=u;
    }
}
