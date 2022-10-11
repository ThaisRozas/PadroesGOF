package src.CardapioComposite;

/**
 * Created by alunod22 on 29/09/2022.
 */

//Agrupa todas as operações, ‘interface’. Todos os metodos para implementar

public abstract class Item {

    //tipo um CRUD do cardapio
    public void adicionar(Item item){ throw new UnsupportedOperationException(); }
    public void remover(Item item){ throw new UnsupportedOperationException(); }
    public void atualizar(Item item){ throw new UnsupportedOperationException(); }

    //metodos utilizados pelo opcao
    public double verPreço(){ throw new UnsupportedOperationException(); }
    public String verDescricao() { throw new UnsupportedOperationException(); }
    public String verNome() { throw new UnsupportedOperationException(); }
    public boolean verificarVegano() { throw new UnsupportedOperationException(); }


}
