package conceitosJava.src.main.java.org.example.polimorfismo;
// adiciona o extends Animal
public class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        // Sobreescrevendo o metodo emitir som
        System.out.println("O cachorro faz: Au Au!");
    }
    // Criando um atributo unico da classe Cachorro
    public  void raca(String raca){

        System.out.println("O cachorro é da raça " + raca);
    }
    // fazendo um metodo e para exibir a mensagem da classe pai
    public void executar(){
        // Utilizando o super para preencher com o conteudo do metodo mensagem
        super.mensagem();
    }
}
