package adapter.heranca;
/*
 * @author ifpb
 */
public class Adaptador extends ClasseExistente implements Alvo {

    public Adaptador() {
    }
    
    
    @Override
    public void operacao(int pin1, int pin2) {
        super.operacao(pin1, pin2, pin2);
    }
    
}
