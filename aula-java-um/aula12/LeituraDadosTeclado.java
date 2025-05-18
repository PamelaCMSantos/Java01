// lendo valores pelo teclado
package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        // Ler a linha inteira
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);
        // Lendo o primeiro digitado
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        // lendo Inteiros
        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Seu idade é: " + idade);
        // lendo Double
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Seu altura é: " + altura);
        // lendo float
        System.out.println("Digite seu peso: ");
        float peso = scan.nextFloat();
        System.out.println("Seu peso é: " + peso);
        // lê o espaço de um byte
        System.out.println("Quantos filhos? ");
        byte filhos = scan.nextByte();
        System.out.println("Seu peso é: " + filhos);
        // lê um caractere na posição 0
        System.out.println("Qual o seu sexo (f/m)? ");
        char sexo = scan.next().charAt(0);
        System.out.println("Seu sexo é: " + sexo);
        // lê um tipo "verdade" ou "falso"
        System.out.println("Você tem algum bicho de estimação? ");
        boolean pet = scan.nextBoolean();
        System.out.println("Quantidade de pets:: " + pet);
        scan.close();

    }
}
