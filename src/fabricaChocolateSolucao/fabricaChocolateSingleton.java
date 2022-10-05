package src.fabricaChocolateSolucao;

public class fabricaChocolateSingleton {
    private boolean empty; //vazio
    private boolean boiled; //fervido
    private static fabricaChocolateSingleton uniqueInstance; //CRIADO PARA SINGLETON

    //C�digo iniciado quando a Caldeira est� vazia
    private fabricaChocolateSingleton() {     //ALTERADO PARA PRIVATE
        empty = true;
        boiled = false;
    }

    //CRIADO PARA SINGLETON
    public static fabricaChocolateSingleton getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Criando uma unica instancia de fabrica de chocolate");
            uniqueInstance = new fabricaChocolateSingleton();
        }
        System.out.println("Retornando uma instancia de fabrica de chocolate");
        return uniqueInstance;
    }

    //Para encher a caldeira, ela deve estar vazia e, quando estiver cheia,
    //configuramos os indicadores de empty e boiled
    public void encher() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // encher a caldeira com uma mistura de leite/chocolate
        }
    }

    //Para drenar a caldeira, ela deve estar cheia (n�o vazia) e tamb�m em ebuli��o.
    //Depois, configuramos empty como true novamente.
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drena na caldeira leite e chocolate
            empty = true;
        }
    }


    //Metodo para ferver
    //Para ferver a mistura, a caldeira deve estar cheia e ainda nao deve ter fervido.
    //Depois de ferver, configuramos o indicador boiled como true.
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}