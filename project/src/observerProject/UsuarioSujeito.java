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
public abstract class UsuarioSujeito {
    protected String email;
    protected String cpf;
    protected String bairro;
    protected String rua;
    protected int num;
    protected String nome;
    
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
