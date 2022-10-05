package src.fabricaChocolate;

public class fabricaChocolate {
    private boolean empty; //vazio
    private boolean boiled; //fervido

    //Codigo iniciado quando a Caldeira esta vazia
    public fabricaChocolate() {     //public constructor!
        empty = true;
        boiled = false;
    }

    //Para encher a caldeira, ela deve estar vazia e, quando estiver cheia,
    //configuramos os indicadores de empty e boiled
    public void preencher() {
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
    //Para ferver a mistura, a caldeira deve estar cheia e ainda n�o deve ter fervido.
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