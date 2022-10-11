package src.questoesComposite;

import src.CardapioComposite.Item;

public class elementoBancodeQuestao extends questaodoBanco {

    public elementoBancodeQuestao(String enunciado, String descricao, String dica, boolean resposta) {
        super(enunciado, descricao, dica, resposta);
    }

    //tipo um CRUD do cardapio
    public void adicionar(src.questoesComposite.elementoBancodeQuestao item){ throw new UnsupportedOperationException(); }
    public void remover(src.questoesComposite.elementoBancodeQuestao item){ throw new UnsupportedOperationException(); }
    public void atualizar(src.questoesComposite.elementoBancodeQuestao item){ throw new UnsupportedOperationException(); }

    //metodos utilizados pelo opcao
    public String verEnunciado(){ throw new UnsupportedOperationException(); }
    public String verDescricao() { throw new UnsupportedOperationException(); }
    public String verDica() { throw new UnsupportedOperationException(); }
    public boolean verificarResposta() { throw new UnsupportedOperationException(); }

}
