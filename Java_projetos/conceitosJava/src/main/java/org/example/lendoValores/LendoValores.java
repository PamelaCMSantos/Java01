package conceitosJava.src.main.java.org.example.lendoValores;
// Para ler os valores digitados pelo teclado, utilizarei a classe Scanner do pacote java.util

//importando o pacote .util e sua classe .Sacnner
import java.util.Scanner;
public class LendoValores {
    public static void main(String[] args) {
        // Criando uma variável (sc) do tipo Scanner que aloca um objeto (= new) na memória,
        // conectando-se diretamente com a classe Scanner (Scanner(System.in)
        Scanner sc = new Scanner(System.in);

        /*       Tipos de dados     */
        // String
        System.out.print("Digite uma palavra ou letra: ");
        String palavra = sc.next();

        // Frases
        System.out.print("Digite uma frase: ");
        String frases = sc.nextLine();

        /*Pesquisa no Gemini: Quando você lê um número (com .nextInt() ou .nextDouble()) e depois tenta ler um texto usando .nextLine(), o programa pula a leitura do texto.

        Por que isso acontece?
        Quando você digita o número e aperta ENTER, o .nextInt() consome apenas o número, mas a tecla ENTER (que gera um caractere de quebra de linha \n) fica "presa" no buffer. O próximo .nextLine() lê essa quebra de linha e acha que o usuário não digitou nada.

        Como resolver:
        Adicione um .nextLine() extra "em branco" logo após ler o número para limpar o buffer de memória.*/

        sc.nextLine(); // Limpa o buffer Consome o ENTER que ficou pendente
        // Inteiro
        System.out.print("Digite um número inteiro: (0)");
        int numeroInt = sc.nextInt();

        // Double
        System.out.print("Digite um número Double: (0,0)");
        Double numeroDouble = sc.nextDouble();

        // Decimal
        System.out.print("Digite um número do tipo Decimal: (0,0)");
        Float numeroFloat = sc.nextFloat();

        // Booleano
        System.out.print("Digite o valor da variável booleana: (false/true)");
        boolean valorBooleano = sc.nextBoolean() ;

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Palavra: " + palavra);
        System.out.println("Frase: " + frases);
        System.out.println("Numero inteiro: " + numeroInt);
        System.out.println("Numero Double: " + numeroDouble);
        System.out.println("Numero Float: " + numeroFloat);
        System.out.println("Valor do tipo Booleano: " + valorBooleano);


        // Deve-se encerrar a variável Scanner criada para liberar a memória alocada no sistema
        sc.close();
    }
}
