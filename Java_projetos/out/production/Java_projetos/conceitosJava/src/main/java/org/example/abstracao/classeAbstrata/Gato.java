package conceitosJava.src.main.java.org.example.abstracao.classeAbstrata;

public class Gato extends Animal {

    // Herdando diretamente o nome da classe pai com o super
    public Gato(String nome) {
        super(nome);
    }
    // Sobreescrevendo o metodo abstrato herdado da classe pai
    @Override
    public void emitirSom() {
        // retorna o nome herdado e o som que o animal faz
        System.out.println(getNome() + " faz: Miau Miau!");
    }
}