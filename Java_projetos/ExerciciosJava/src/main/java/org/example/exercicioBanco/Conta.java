package org.example.exercicioBanco;

public abstract class Conta {
   private String nome;
   protected double saldo;

   public  Conta(String nome, double saldoInicial) {
       this.nome = nome;
       this.saldo = saldoInicial;
   }
   public String getNome() {
       return nome;
   }
   public void depositar(double valor) {
       saldo = saldo + valor;
       System.out.println("Deposito efetuado com sucesso! Seu saldo atual é de: " + saldo);
   }
   public double getSaldo() {
       return saldo;
   }
   public void sacar(double valor) {

       if (saldo > valor) {
           saldo = saldo - valor;
           System.out.println("Saque efetuado com sucesso! Seu saldo atual é de: " + saldo);
       }else if (saldo == 0) {
           System.out.println("Você não possui saldo para saque. Sado: " + saldo);
       } else{
           System.out.println("O saldo é insuficiente para efetuar o saque");
       }
   }
    public void exibirInformacoes() {
        System.out.println("Titular: " + nome + " | Saldo: R$ " + saldo);
    }

}
