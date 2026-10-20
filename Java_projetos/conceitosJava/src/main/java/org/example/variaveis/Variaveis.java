package conceitosJava.src.main.java.org.example.variaveis;

import java.util.Arrays;

public class Variaveis {
    public static void main(String[] args) {

        //TIPOS DE DADOS PRIMITIVOS

        //Como declaramos as variáveis
        // Tipos INTEIROS
        byte idade;
        short soma;
        int valor;
        long custo;

        // Tipos DECIMAIS
        float preco;
        double salario;

        // Tipo LÓGICO
        boolean escolha;

        // Tipo CARACTERE
        char letra;


        //TIPOS DE DADOS REFERENCIADOS

        // STRING
        /* Embora String seja utilizada para declarar variáveis,
        ela é uma sequência de caracteres, em Java String é uma classe */
        String nome;

        // ARRAYS (VETOR OU MATRIX)
        int[] numeros;
        String[] cidades;

        //Como Atribuir valores as variáveis:
        valor = 1;
        preco = 1200;
        salario = 2000;
        escolha = false;
        letra = 'a';
        nome = "Maria";

        //Exibindo os valores
        System.out.println("valor = " + valor);
        System.out.println("salario = " + salario);
        System.out.println("escolha = " + escolha);
        System.out.println("letra = " + letra);
        System.out.println("nome = " + nome);

        System.out.println("******************************************************");
        // Modificando as variáveis
        valor = 2; // modificando com um número determinado
        System.out.println("Veja que apenas a variável valor modificou: ");
        System.out.println("valor = " + valor);
        System.out.println("salario = " + salario);
        System.out.println("escolha = " + escolha);
        System.out.println("letra = " + letra);
        System.out.println("nome = " + nome);

        preco = preco + valor;// modificando com o antigo preco + o valor da variável 'valor'

        salario = salario - preco; // modificando com o antigo salario - o valor da variável 'preco'
        escolha = true;
        letra = 'b';
        nome = "Maria da Paz";

        System.out.println("******************************************************");
        System.out.println("Veja que agora, todas as variáveis foram modificadas: ");
        System.out.println("valor = " + valor);
        System.out.println("salario = " + salario);
        System.out.println("escolha = " + escolha);
        System.out.println("letra = " + letra);
        System.out.println("nome = " + nome);

        System.out.println("******************************************************");
        // Adicionando valores aos Arrays
        numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        cidades = new String[]{"Castanhal", "Belém"};

        System.out.println("Arrays: ");
        // Ao printar os arrays em um println: Converte o array em um texto de formatado: [1, 2,... ]
        System.out.println("numeros : " + Arrays.toString(numeros));

        System.out.println("cidades : " + Arrays.toString(cidades));
        /*
        * Outra maneira de atribuir valores as variáveis é fazer isso diretamente
        * no momento da sua declaração*/
        //EX Primitivos
        System.out.println("******************************************************");
        System.out.println("A outra forma de atribuição ");
        int cpf = 20234567;
        System.out.println("CPF = " + cpf);

        // EX Referenciados
        char[] letras2 = new char[5];
        /*
        * 1. Ao atribuir valores a um array, a posição em que aquele valor irá ocupar sera definida pelo
        * numero dentro do colchete [].
        * Ex: letras2[4] = 'c'; atribui o valo 'c' a POSIÇÃO 4 no Array
        * 2. O Array começa com a posição 0, então ao atribuir, deve-se começar pela posição [0]*/
        letras2[0] = 'a';
        letras2[1] = 'b';
        letras2[4] = 'c';
        letras2[3] = 'd';
        // Para imprimir cada elemento em uma linha ou trabalhar com cada um deles,
        // utilizamos um laço de repetição chamado for
        System.out.println("Imprimindo letras2: ");
        for (int num : numeros) // declara uma variável chamada 'num' pque recebe os valores do array numeros
        {
            // Cada 'num' do array, será lido e exibido
            System.out.println("Número: " + num);
        }


    }
}
