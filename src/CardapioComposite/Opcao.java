package src.CardapioComposite;

public class Opcao extends Item {

    //atributos da folha, que seriam as opções do cardapio
    String nome;
    String descricao;
    double preco;
    boolean vegano;

    //metodo construtor
    public Opcao( String nome, String descricao, boolean vegano, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.vegano = vegano;
        this.preco = preco;
    }

    //Chamando os metodos...
    public double verPreço(){ return preco; }
    public String verDescricao() { return descricao; }
    public String verNome() { return nome; }
    public boolean verificarVegano() { return vegano; }

}
