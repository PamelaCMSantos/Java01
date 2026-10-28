package conceitosJava.src.main.java.org.example.polimorfismo;

public class Gato extends Animal{
    @Override
    public void emitirSom(){
        // Sobreescrevendo o metodo emitir som
        System.out.println("O Gato faz: Miau Miau!");
    }
    // Criando um atributo unico da classe Gato
    public  void raca(String raca){

        System.out.println("O gato é da raça " + raca);
    }
    /* Deixei em comentário, para saber que ao tirar aparece que não
    se pode aplicar o @Override para o metodo mensagem
    @Override
    public class mensagem(){
        System.out.println("É um animal muito fofo");
    }*/
    // Como utilizar corretamente:

    public void executar(){
        // Utilizando o super para preencher com o conteudo do metodo mensagem
        super.mensagem();
    }
}
