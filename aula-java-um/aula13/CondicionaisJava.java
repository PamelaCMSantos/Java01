package aula13;

import java.util.Scanner;

public class CondicionaisJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        int anos = 18%idade;

        //Condicional if-else

        // verificar se é maior de idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {

            System.out.println("Você é menor de idade! Ainda faltam " + anos + " anos para você completar 18 anos.");
        }
        System.out.println("Digite o valor do produto: ");
        double valor = scan.nextDouble();
        // verificar valor do produto
        if(valor<=10){
            System.out.println("Valor está barato");
        } else if (valor>10 && valor<=15) {
            System.out.println("Valor está maior, pedir desconto");
        } else if (valor>15 && valor<=25) {
            System.out.println("Pode pesquisar mais");
        } else if (valor>25) {
            System.out.println("Item muito caro");
        }
        */
        // Condicional Switch-Case

        // verificar dia da semana
        System.out.println("Digite o dia da semana: ");
        int diaSemana = scan.nextInt();
        /*
        switch (diaSemana) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-feira"); break;
            case 3: System.out.println("Terça-feira"); break;
            case 4: System.out.println("Quarta-feira"); break;
            case 5: System.out.println("Quinta-feira"); break;
            case 6: System.out.println("Sexta-feira"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Opção inválida, a semana possui 7 dias!"); break;
        }
        */
        // outra utilização do Switch-Case
        // Caso o usuário queira saber se é um dia útil
        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil"); break;
            case 1:
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Opção inválida, a semana possui 7 dias!"); break;
        }
        
        scan.close();
    }
}
