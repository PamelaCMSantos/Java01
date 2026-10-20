package conceitosJava.src.main.java.org.example.encapsulamento;
import java.util.Scanner;
/*
* O encapsulamento serve par esconder dados internos das classes, e restringe o acesso direto
* a eles vindo de fora da classe. Apenas métodos controlados podem ser alterados
*
* Em java, utilizamos os métodos get/set para ler e modificar esses métodos(atributos)*/


public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Explicação do trecho: Pessoa p1 = new Pessoa();
        * Gemini:
        * 1. Pessoa (Tipo de Dado / Classe)
          Indica o tipo da variável. Como Pessoa é uma classe que você criou, ela funciona como um tipo de dado personalizado (um tipo referenciado).

          2. p (Nome da Variável / Referência)
          É o nome que você escolheu para identificar essa referência. A variável p não guarda os dados da pessoa diretamente; em vez disso, ela guarda o endereço de memória onde o objeto Pessoa estará alocado.

          3. = new (Alocação de Memória)
          A palavra-chave new solicita ao Java que aloque um novo espaço na memória principal (na região chamada heap) para guardar este novo objeto.

          4. Pessoa() (Invocação do Construtor)
          Chama o construtor da classe Pessoa. O construtor é um método especial encarregado de construir e inicializar os atributos do novo objeto no momento de sua criação.

          Você está criando um novo objeto do tipo Pessoa na memória e guardando o seu endereço na variável de referência p.*/

        Pessoa p1 = new Pessoa();
        //Atribuindo valores:
        p1.setIdade(40);
        p1.setNome( "Maria");
        // Exibindo os valores:
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        //    preenchendo utilizando a leitura do teclado
        //Recebendo os valores
        System.out.println("Digite a idade: ");
        int idadePessoa2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome: ");
        String nomePessoa2 = sc.nextLine();
        System.out.println("Usuário ativo? (true/false) ");
        boolean status = sc.nextBoolean();

        // recebendo os parâmetros por vaiáveis lidas pelo teclado
        Pessoa2 p2 = new Pessoa2(nomePessoa2, idadePessoa2,status);
        // exibindo valores e se o usuário é ativo ou não
        if (p2.isAtivo()) {
            System.out.println("Acesso liberado para o usuário " + p2.getNome());
            System.out.println("Idade: " + p2.getIdade());
        } else {
            System.out.println("O usuário "+ p2.getNome()+ " bloqueado no sistema.");
            System.out.println("Idade: " + p2.getIdade());

        }

        // Alterando o status com o setter normal
        p2.setAtivo(false);

        System.out.println("Status atualizado: " + p2.isAtivo());
    }
}
