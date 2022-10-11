package src.patoPeruAdapter;

public class peruAdapter implements Pato {

    private PeruSelvagem peru = new PeruSelvagem();
    @Override
    public void grasnar() {
        peru.gorgolejar();
    }

    @Override
    public void voar() {
        peru.voar();
    }

    //receber os métodos de pato e retornar peru
}
