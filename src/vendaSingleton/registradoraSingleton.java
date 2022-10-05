package src.vendaSingleton;

public class registradoraSingleton {

    private boolean registrarVenda;
    private boolean autorizaPagamento;
    private static registradoraSingleton uniqueInstance; //instância única da classe

    //Construtor privado
    private registradoraSingleton(){
        registrarVenda = false;
        autorizaPagamento=false;
    }

    //Chamada do singleton para criar uma instância da registradora. Isso porque num sistema de vendas ela será chamada várias vezes para diferentes vendas, mas não precisa
    //ser inicializada em toda venda para autorizá-la e registrá-la. Usamos o singleton para deixar claro que é apenas uma registradora e chamaremos várias vezes o método da mesma classe.
    public static registradoraSingleton getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Criando uma unica instancia da Registradora");
            uniqueInstance = new registradoraSingleton();
        }
        System.out.println("Retornando uma instancia da Registradora");
        return uniqueInstance;
    }

    public void registrar(){
        if (isAutorizaPagamento()){
            registrarVenda = true;
        }
    }

    public boolean isAutorizaPagamento(){
        return autorizaPagamento;
    }

}
