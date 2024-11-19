public class Funcionario extends Pessoa implements Acessavel{    

    public Funcionario(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
        
    }

    @Override
    public void acessar() {
        
    }
}
