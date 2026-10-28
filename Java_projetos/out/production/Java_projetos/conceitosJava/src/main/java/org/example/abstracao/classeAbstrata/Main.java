package conceitosJava.src.main.java.org.example.abstracao.classeAbstrata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lendo os nomes pelo teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cachorro: ");
        String nomeCachorro = sc.nextLine();
        System.out.println("Digite o nome do gato: ");
        String nomeGato = sc.nextLine();
        // Animal a = new Animal("Bicho"); // geraria um ERRO DE COMPILAÇÃO! Classe abstrata não aceita 'new'.
        // Para chamar as classes filhas, deve OBRIGATORIAMENTE chama-las diretamente

        Animal cachorro = new Cachorro(nomeCachorro);
        Animal gato = new Gato(nomeGato);

        cachorro.emitirSom(); // Imprime: Rex faz: Au Au!
        gato.emitirSom(); // Imprime: Felix faz: Miau Miau!
    }
}
