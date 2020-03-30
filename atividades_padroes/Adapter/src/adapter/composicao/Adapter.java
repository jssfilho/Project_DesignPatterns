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
public class Adapter extends Alvo{
    ClasseExistente cE = new ClasseExistente();
    
    @Override
    public void operacao(int pin1, int pin2) {
        cE.operacao(pin1, pin2, pin2);
    }
    
    
}
