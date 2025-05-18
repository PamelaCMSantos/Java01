package aula13;

public class OperadoresEmJava {
    public static void main(String[] args) {

        String primeiraString= "O resultado ";
        String segundaString= "final é: ";
        String terceiraString= primeiraString + segundaString;
        int resultado= 1+2;
        System.out.println(resultado);

        /* as linhas também pode ser usadas para substituir:
         resultado= resultado -1;
         resultado--;*/
        resultado-=1;
        System.out.println(resultado);

        resultado = resultado*2;
        System.out.println(resultado);

        resultado= resultado/2;
        System.out.println(resultado);

        resultado= resultado+8;
        System.out.println(resultado);

        resultado= resultado%7;
        System.out.println(resultado);

        // usando o operador "+" para concatenar strings
        System.out.println(terceiraString +" " + resultado);

        // imprime e adiciona o valor depois
        System.out.println(resultado++);

        // adiciona o valor e depois imprime
        System.out.println(++resultado);

    }
}
