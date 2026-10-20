package conceitosJava.src.main.java.org.example.operadores;

public class Operadores {
    public  static void main(String[] args) {
        int a = 20;
        int b = 3;
        int c;
        int d;
        int e;
        int f;
        int g;
        // TIPOS DE OPERADORES ARITMÉTICOS

        //(+) Adição: Soma de dois valores
        c = a + b;
        // (-) Subtração: Subtrai o segundo valor do primeiro
        d = a - b;
        // (/) Divisão: Divide o primero pelo segundo
        e = a / b;
        // (*) Multiplicação: Multiplica os dois valores
        f = a * b;
        // (%) Resto da divisão: Retorna o resto da divisão do primeiro valor pelo segundo
        g = a % b;
        System.out.println("Operadores aritméticos: ");
        System.out.println("Soma = " + c);
        System.out.println("Subtração = " + d);
        System.out.println("Divisão = " + e);
        System.out.println("Multiplicação = " + f);
        System.out.println("Modulo = " + g);
        System.out.println(" ");
        // Pode-se utilizar o print para fazer a operação diretamente
        System.out.println("Utilizando o print para a operação: ");
        System.out.println( a + f );
        System.out.println("******************************************************");

        // TIPOS DE OPERADORES DE ATRIBUIÇÃO

        // (=) Atribuição: Atribui um valor a uma variável
        int h = 5;

        /*
        * Em atribuição, sempre que o símbolo (=) estiver acompanhado de um OPERADOR ARITMÉTICO (+, -, *, /, %, ...),
        * ele atribui: A variável seu próprio valor mais a atribuição (Somar, multiplicar, ...)*/
        // Ex: a +=3, é a mesma coisa que: a = a + 3;
        a -= h;
        b += h;
        c *= h;
        d/=h;
        System.out.println("Operadores de Atribuição: ");
        System.out.println("Operador += :");
        System.out.println( a +=h);
        System.out.println("Operador -= :");
        System.out.println( a -=h);
        System.out.println("Operador *= :");
        System.out.println( a *=h);
        System.out.println("Operador /= :");
        System.out.println( a /=h);
        System.out.println(" ");
        System.out.println("************************************");

        // OPERADORES DE INCREMENTO
        int incremento = 10;
        System.out.println("Incremento: " + incremento);

        // (++) Incremento: Aumenta o valor em 1. Ou seja: a++ é o mesmo que a = a + 1.
        incremento++;
        System.out.println("Incremento: " + incremento);

        // (--) Decremento: Diminui o valor em 1 (a-- é o mesmo que a = a - 1).
        incremento--;
        System.out.println("Incremento: " + incremento);

        // OPERADORES RELACIONAIS (COMPARAÇÃO): 'true' 'false'
        int x = 1;
        int y = 2;

        // (==) Igual: Compara se os valores são iguais, dando um resultado
        System.out.println(x == y); // o resultado deve ser falso
        // (!=) Diferente de: Compara se os valores são diferentes
        System.out.println(x != y);
        // (>) Maior que: Compara se o primeiro é maior que o segundo
        System.out.println(x > y);
        // (<) Menor que: Compara se o primeiro é menor que o segundo
        System.out.println(x < y);
        // (>=) Maior ou igual: compara se o primeiro é MAIOR OU IGUAL ao segundo
        System.out.println(x >= y);
        // (<=) Menor ou igual: compara se o primeiro é MENOR OU IGUAL oa segundo
        System.out.println(x <= y);
        System.out.println("*********************************");

        // OPERADORES LÓGICOS
        /*
        *(&&) AND / E: Retorna true apenas se todas as condições forem verdadeiras.
        * (||) OR / OU: Retorna true se pelo menos uma das condições for verdadeira.
        * (!) NOT / Negação: Inverte o valor booleano (!true vira false).
        *                 UTILIZANDO O CONDICIONAL IF PARA EXEMPLIFICAR
         */
        // OBS: O exemplo sempre vai dar verdadeiro, pois as variáveis são constantes
        int idade = 18;
        Boolean carteira = true;
        if (idade >=18 && carteira) {
            System.out.println("Pode tirar carteira");

        } else if (idade <=18 && !carteira) {
            System.out.println("Não pode tirar carteira");
        }

        // Comparação de Strings em Java:
        String texto1 = "java";
        String texto2 = "java";
        boolean saoIguais = texto1.equals(texto2); // deve dar true

    }
}
