package src.CardapioComposite;

import java.util.ArrayList;

/**
 * Created by alunod22 on 29/09/2022.
 */
public class Cardapio extends Item {

    //atributos
    String nome;
    String descricao;
    ArrayList item = new ArrayList();

    //metodo construtor
    public Cardapio(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    //classes que são implementadas pela interface
    public void adicionar(){}
    public void remover(){}
    public void atualizar(){}

    public String verNome(){ return nome;}
    public String verDescricao(){ return descricao; }

}
