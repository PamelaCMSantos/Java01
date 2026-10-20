package conceitosJava.src.main.java.org.example.encapsulamento;
/*Para o segundo exemplo, passamos os valores por meio de um construtor*/
public class Pessoa2 {
    private String nome;
    private int idade;
    private boolean ativo;
    // Criando um construtor
    public Pessoa2(String nome, int idade, boolean status) {
        this.nome = nome;
        this.idade = idade;
        this.ativo = status;
    }
    // Agora, deve-se criar os getter/setter para as variáveis

    // Para nome
    public String getNome() {// lendo a variável nome
        return nome;
    }
    //   O que acontece no trecho: this.nome = nome; ?
    /*Gemini:
    this.nome (Lado Esquerdo):

    A palavra-chave this significa "esta instância" ou "este objeto atual".

    Ao escrever this.nome, você está dizendo explicitamente ao Java: "Estou me referindo ao atributo da classe pertencente ao objeto".

    = (Atribuição):

    Copia o valor que está do lado direito para a variável do lado esquerdo.

     nome (Lado Direito):

     Refere-se à variável local, ou seja, o parâmetro recebido entre os
     parênteses do método setNome(String nome).
     */
    public void setNome(String nome) { //pega o parâmetro nome (String nome) e atualiza a variável local nome
        this.nome = nome;
    }

    // get/set para idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idadePessoa) {
        if (idadePessoa >= 0) {
            this.idade = idadePessoa;
        } else{
            //DICA: Digitar out + enter irá preencher automaticamente a expressão para printar no Kotlin
            System.out.println("Erro!!! A idade não pode ser menor que zero");}
    }
    // para o get/set do tipo booleano, utilizamos o is ao invés do get
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
