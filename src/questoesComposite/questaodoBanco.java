package src.questoesComposite;
import java.io.Console;

//Agrupa todas as operações, interface. Todos os metodos para implementar

public abstract class questaodoBanco {

    //atributos da folha, que seriam as opções do cardapio
    String enunciado;
    String descricao;
    String dica;
    boolean resposta;

    //metodo construtor
    public questaodoBanco( String enunciado, String descricao, String dica, boolean resposta){
        this.enunciado = enunciado;
        this.descricao = descricao;
        this.dica = dica;
        this.resposta = resposta;
    }

    //Chamando os metodos...

    public String verEnunciado(){ return enunciado; }
    public String verDescricao() { return descricao; }
    public String verDica() { return dica; }
    public boolean verificarResposta() { return resposta; }


}
