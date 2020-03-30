/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.composicao;

/**
 *
 * @author ifpb
 */
public class Cliente {
    private int pin1;
    private int pin2;
    
    public Cliente(){
        
    }
    public void conectar(int pin1, int pin2){
        this.pin1=pin1;
        this.pin2=pin2;
        Adapter alvo = new Adapter();
        alvo.operacao(pin1, pin2);
    }
}
