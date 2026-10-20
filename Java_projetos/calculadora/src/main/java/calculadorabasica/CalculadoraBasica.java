package calculadora.src.main.java.calculadorabasica;

import  java.util.Scanner;
public class CalculadoraBasica {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int opcao =0;
        System.out.println("Qual o primeiro número? ");
        int num1= scanner.nextInt();
        System.out.println("Qual o segundo número? ");
        int num2= scanner.nextInt();
        int resultado;
        do{
            System.out.println("O que deseja fazer? ");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("          MENU         ");
            System.out.println("1- Somar ");
            System.out.println("2- Subtrair ");
            System.out.println("3- Dividir ");
            System.out.println("4- Multiplicar ");
            System.out.println("5- Resto da divisão ");
            System.out.println("6- Sair ");
            System.out.println("+++++++++++++++++++++++++++");
            opcao= scanner.nextInt();
            switch (opcao){
                case 1:
                    resultado= num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + resultado );
                    break;
                case 2:
                    resultado= num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + resultado );
                    break;
                case 3:
                    resultado= num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + resultado );
                    break;
                case 4:
                    resultado= num1 * num2;
                    System.out.println(num1 + "x" + num2 + "=" + resultado );
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Erro: Não é possível dividir por zero!");
                    } else {
                        int resto = num1 % num2; // O operador % pega o resto
                        System.out.println("O resto da divisão de " + num1 + " por " + num2 + " é: " + resto);
                    }
                    break;
                default:
                    System.out.println("Opção inválida ");
            }
        } while (opcao!=6);

    }
}
