package org.example.exercicioBanco;

public class ContaCorrente extends Conta implements Tributo {

    public ContaCorrente(String nome, Double saldo) {
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
        System.out.println("Tipo de  Conta: Corrente");
    }
    @Override
    public void calcularImposto(double rendimentoObtido) {
        double impostoDevido;
        double aliquotaDias = 22.5/100; // Vou considerar a Alíquota de até 180 dias
        if (rendimentoObtido >= 140) {
            impostoDevido = rendimentoObtido * aliquotaDias;
            System.out.println("O valor de impostos a pagar é de: " + impostoDevido);
        } else if (rendimentoObtido <140) {
            System.out.println("Você não precisa pagar imposto ");
        }
    }
    /*
    * Você apenas tem a obrigatoriedade de declarar o saldo no
    * Imposto de Renda se o valor em 31 de dezembro do ano-base for superior a R$ 140,00
    * Se a sua conta corrente for uma conta remunerada (que rende automaticamente,
    * geralmente atrelada ao CDI, como em bancos digitais),
    * os rendimentos obtidos são tributados
    *• Tabela Regressiva do Imposto de Renda (Renda Fixa):
    * O imposto é retido na fonte automaticamente no resgate ou no final do período,
    * seguindo estas alíquotas:
	• Até 180 dias: 22,5%
	• De 181 a 360 dias: 20%
	• De 361 a 720 dias: 17,5%
	• Acima de 720 dias: 15%
• Como calcular: O imposto não é calculado sobre o saldo total da conta,
* mas somente sobre o lucro (o rendimento) que o dinheiro produziu. */
}
