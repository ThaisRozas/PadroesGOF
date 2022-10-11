package src.questoesComposite;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.lang.System.in;

public class bancoquestoesComposite {
    //atributos
    String nome;
    int quantidade;
    String descricao;
    ArrayList questaodoBanco = new ArrayList();

    //metodo construtor
    public bancoquestoesComposite(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    //classes implementadas pela interface
    public void adicionar(){}
    public void remover(){}
    public void atualizar(){}

    public String verNome(){ return nome;}

    public int contarQuantidade(){ return quantidade; }
    public String verDescricao(){ return descricao; }
}
