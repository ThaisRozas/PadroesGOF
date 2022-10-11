package src.questoesComposite;
import java.io.Console;

public class questaodoBanco {

    public Questao(String descricao) : base(descricao) { }

        public override void Exibir()
        {
            Console.WriteLine("Questão: {0}", Descricao);
        }

}
