/*
 * To change this license header, choose License Headers in SujeitoConcreto Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://docs.oracle.com/javafx/2/fxml_get_started/custom_control.htm
https://stackoverflow.com/questions/40698481/javafx-errors-with-fxmlloader-loadgetclass-getclassloader-getresourcelogi
 */
package observerProject;

import abstractFactoryProject.FacadeProject;
import bridgeProject.*;
import abstractFactoryProject.*;
import factoryMethod.*;
import java.io.IOException;


/**
 *
 * @author Joao Santos
 */
public final class SujeitoConcreto extends Sujeito {
    private Factory fac = null;
    private FacDefault facd;
    private FacadeProject fP;
    public Usuario u;

    public SujeitoConcreto(FacDefault facd, FacadeProject fP) {
        this.facd = facd;
        this.fP = fP;
    }
    
    public  String viewAtual = "Login";
    
    
    public SujeitoConcreto() throws IOException{
        initOne();
    }
    
    public Usuario getU(){
        return this.u;
    }
    public void setU(Usuario u) throws IOException{
        if(u!=null){
            this.u = u;
            if (this.u.isTipo()){
                
                this.fac = new FacAdm();
            }else{
                
                this.fac = new FacCliente();
            }

            Home h = this.fac.getHome();
            View vHome = new View(h.getLoad().load(),"Home");
            vHome.p=this;
            Configuracoes c = this.fac.getConfig();
            View vConfig = new View(c.getLoad().load(),"Config");
            vConfig.p=this;
            this.add(vHome);
            this.add(vConfig);
            mainfx.OnChangeScene("Home");
        }else{
            
            for(Observador ob: this.observadores){
                if(ob.getTipo().equals("Home") || ob.getTipo().equals("Config"))
                    this.rem((View) ob);
            }
        }
    }
  
    
    public View getAtualCena(){
        View ov = null;
        for(View ob: this.observadores){
            if(this.viewAtual.equals(ob.getTipo())){
                ov = ob;
            }
        }
        return ov;
    }
    
    public void setCenaAtual(String s){
        this.viewAtual=s;
        notifique();
    }
    
    public void initOne() throws IOException{
        this.facd = new FacLogin();
        PaginaInicial d = this.facd.getCena();
        View vLogin = new View(d.getParent().load(),"Login");
        this.facd = new FacCadastro();
        d = this.facd.getCena();
        View vCadastro = new View(d.getParent().load(),"Cadastro");
        vLogin.p=this;
        this.add(vLogin);
        vCadastro.p=this;
        this.add(vCadastro);
        
    }
    
}
