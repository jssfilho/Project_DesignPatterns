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
public class ClasseExistente {
    private int pin1;
    private int pin2;
    private int pin3;

    public ClasseExistente() {
    }
    
    public void operacao(int pin1,int pin2,int pin3){
        this.pin1=pin1;
        this.pin2=pin2;
        this.pin3=pin3;
        System.out.println("100%");
    }
}
