package src.questoesComposite;

import java.io.Console;
import java.util.List;
import java.util.function.Consumer;

import static java.lang.System.in;

public class bancoquestoesComposite {
    private IList<elementoBancodeQuestao> _elementos = new List<elementoBancodeQuestao>() {}
    public IEnumerable<elementoBancodeQuestao> Elementos { get { return _elementos; } }

    public void Bloco(String descricao): void base(descricao) { }

    public override void Exibir()
            {
            Console.WriteLine("Bloco: {0}", Descricao);
            foreach (var elemento in _elementos)
            elemento.Exibir();
            }

    public void Adicionar(elementoBancodeQuestao elemento)
            {
            _elementos.Add(elemento);
            }

    public void Remover(elementoBancodeQuestao elemento)
            {
            _elementos.Remove(elemento);
            }
            }{

}
