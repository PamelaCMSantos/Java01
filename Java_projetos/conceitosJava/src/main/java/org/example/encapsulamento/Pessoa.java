package conceitosJava.src.main.java.org.example.encapsulamento;

//     O que é get/set?  //
/* Gemini:
 * get (Obter/Ler): Retorna o valor atual do atributo.

 * set (Definir/Alterar): Recebe um novo valor como parâmetro,
 * valida (se necessário) e atualiza o atributo usando a palavra-chave this.
 * */

public class Pessoa {
    //Criando os atributos privados da classe pessoa, utiliza-se o 'private'
    private String nome;
    private int idade;
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

}
