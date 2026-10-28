package conceitosJava.src.main.java.org.example.abstracao.classeAbstrata;

// Criamos uma classe/motodo Abstrata(o) adicionando o abstract a ela
// Lembrando que ao declarar um novo animal, ela não irá aceitar a criação de um animal que seja animal.
// EX: Animal cachorro = new Animal("Nome");
public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Criando o metodo que será herdado por todos
    public String getNome() {
        return nome;
    }

    // Criando um metodo Abstrato: SEM CORPO.
    // Cada classe filha É OBRIGADA a implementar
    // E fazer as suas próprias modificações!
    public abstract void emitirSom();
}
