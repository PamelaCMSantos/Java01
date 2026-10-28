package conceitosJava.src.main.java.org.example.abstracao.classeAbstrata;

//
public class Cachorro extends Animal {

    // herdando o nome diretamente
    public Cachorro(String nome) {
        super(nome);
    }
    // Como no polimorfismo, utiliza-se o @Override
    // A diferença aqui é que a claasse filha é OBRIGADA a implementar a classe abstrata da classe pai
    @Override
    public void emitirSom() {
        // imprimindo o nome e o som que o animal faz
        System.out.println(getNome() + " faz: Au Au!");
    }
}