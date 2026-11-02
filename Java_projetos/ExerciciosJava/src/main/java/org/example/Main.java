package org.example;

import org.example.exercicioBanco.Conta;
import org.example.exercicioBanco.ContaCorrente;
import org.example.exercicioBanco.ContaPoupanca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Criando os objetos de forma diferente. Pois, utilizarei métodos específicos de cada um deles
            // e preciso praticar como fazer nas duas formas
            ContaCorrente conta = new ContaCorrente("Maria", 1000.00);
            Conta conta1 = new ContaPoupanca("João", 2000.00);
            int opcao;
            do {
                System.out.println("""
                        +-------------------------------------------+
                        |               Menu                        |
                        | 1 - Depositar                             |
                        | 2 - Sacar                                 |
                        | 3 - Informações das Contas                |
                        | 4 - Rendimento Conta Poupança             |
                        | 5 - Imposto Conta Corrente                |
                        | 6 - Sair                                  |
                        +-------------------------------------------+
                        
                        Escolha a sua opção:
                        """);

                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Em qual conta deseja depositar? Corrente (C) ou Poupança (P) ");
                        String resposta = sc.next();
                        if (resposta.equals("C")) {
                            System.out.println("Digite o valor para deposito: ");
                            double valorDepositoCorrente = sc.nextDouble();
                            conta.depositar(valorDepositoCorrente);
                        } else if (resposta.equals("P")) {
                            System.out.println("Digite o valor para deposito: ");
                            double valorDepositoPoupanca = sc.nextDouble();
                            conta1.depositar(valorDepositoPoupanca);
                        } else {
                            System.out.println("Erro ao reconhecer o tipo de conta, por favor escolha entre as Letras C ou P");
                        }
                        break;
                    case 2:
                        System.out.println("De qual conta deseja Sacar? Corrente (C) ou Poupança (P) ");
                        String resp = sc.next();
                        if (resp.equals("C")) {
                            System.out.println("Digite o valor do Saque: ");
                            double valorSaqueCorrente = sc.nextDouble();
                            conta.sacar(valorSaqueCorrente);
                        } else if (resp.equals("P")) {
                            System.out.println("Digite o valor do Saque: ");

                            double valorSaquePoupanca = sc.nextDouble();
                            conta1.sacar(valorSaquePoupanca);
                        } else {
                            System.out.println("Erro ao reconhecer o tipo de conta, por favor escolha entre as Letras C ou P");
                        }
                        break;
                    case 3:
                        System.out.println("Informações da conta: ");
                        conta.exibirInformacoes();
                        System.out.println("Informações da conta: ");
                        ((ContaPoupanca) conta1).exibirInformacoes();
                        break;
                    case 4:
                        System.out.println("O rendimento da sua conta foi: ");
                        ((ContaPoupanca) conta1).rendimentoAnual();
                        System.out.println("OBS: O valor considera que rende 6% do CDI. este valor seria o rendimento Anual ");
                        break;
                    case 5:
                        System.out.println("Digite o valor do rendimento da conta Corrente: ");
                        double valorRendimento= sc.nextDouble();
                        conta.calcularImposto(valorRendimento);
                        System.out.println("OBS: Os valores são com base no valor mínimo de rendimento de R$ 140");
                        System.out.println("E na Alíquota de até 180 dias ");
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 6);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        }
    }
}