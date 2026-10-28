package conceitosJava.src.main.java.org.example.polimorfismo;

public class Animal {
    /*     Conceito de Polimorfismo
    // Gemini:
    A Conexão Direta entre Herança e Polimorfismo:
    O polimorfismo depende diretamente da herança (ou de interfaces) para acontecer.

    1. A Herança cria a relação de "é um" (ex: Cachorro é um Animal, Gato é um Animal).

    2. O Polimorfismo aproveita essa relação para permitir que uma variável do tipo
    genérico (Animal) receba uma instância de qualquer classe filha (new Cachorro() ou new Gato()).
    * */
    // Vamos testar isso criando uma classe animal e dar as caracteristicas específicas para cada especie criada (EX: cachorro deve latir, gato miar)
    public void emitirSom(){

        System.out.println("A classe deve ser sobreescrita ");
    }
    // a classe mensagem deve aparecer em todos
    // A classe mensagem foi protegida, ou seja, não pode ser alterada diretamente. Mas pode ser chamada por elas
    protected void mensagem(){
        System.out.println("É um animal muito fofo");
    }

}
