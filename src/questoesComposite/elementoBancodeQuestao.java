package src.questoesComposite;

public abstract class elementoBancodeQuestao {
    protected String Descricao;

    public elementoBancodeQuestao(String descricao)
    {
        Descricao = descricao;
    }
    public abstract void Exibir();
}
