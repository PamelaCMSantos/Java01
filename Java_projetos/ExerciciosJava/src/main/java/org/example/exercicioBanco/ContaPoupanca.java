package org.example.exercicioBanco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String nome, Double saldo) {
        super(nome, saldo);
    }
    public void depositar(double valor){
        super.depositar(valor);
    }
    public void sacar(double valor){
        super.sacar(valor);

    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de conta: Poupança");
    }
   public void rendimentoAnual(){
        double rendimento = (saldo*6)/100;  // Calculando o rendimento
        double saldoAtual = saldo + rendimento; // Adicionando o rrendimento ao valor do saldo
        System.out.println("Sua conta rendeu: " + rendimento);
       System.out.println("Seu saldo atual é: " + saldoAtual);
   }
}
