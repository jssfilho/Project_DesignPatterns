package adapter.heranca;
/*
 * @author ifpb
 */
public class Cliente {
    private int pin1;
    private int pin2;
    private final Adaptador adapter = new Adaptador();
    
    public void conectar(int pin1, int pin2){
        this.pin1=pin1;
        this.pin2=pin2;
        adapter.operacao(pin1, pin2);
    }
}
