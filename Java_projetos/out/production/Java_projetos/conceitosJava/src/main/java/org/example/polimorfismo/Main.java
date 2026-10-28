package conceitosJava.src.main.java.org.example.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a raça do cachorro: ");
        String raca = sc.nextLine();

        System.out.println("Digite a raça do gato: ");
        String raca2 = sc.nextLine();
        // Existem duas formas de declarar as classes filhas:
        // Caso queira acessar os metodos exclusivos da classe filha desde o inicio:
        Cachorro meuAnimal1 = new Cachorro();
        meuAnimal1.raca(raca); // Imprime a raça do cachorro

        // Caso queira manter a classe pai como referência:
        Animal meuAnimal2 = new Gato();
        // para chamar um metodo específico da classe filha que mantem a classe pai como referência
        // Deve-se dizer explicitamente ao Java que o Animal criado é um Gato. Para isso,
        // utiliza-se o "type casting' que converte a referência genérica de "Animal" em uma específica de Cachorro
        ((Gato) meuAnimal2).raca(raca2);

        // Ciando uma lista
        List<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add(new Cachorro());// Adicionando o Cchorro
        listaDeAnimais.add(new Gato()); // Adicionando o Gato
        listaDeAnimais.add(new Animal()); // Adicionando um animal genérico

        System.out.println("\n--- Percorrendo a lista ---");
        for (Animal animal : listaDeAnimais) {

            // Chamada polimórfica comum a todos os Animais
            animal.emitirSom();
            animal.mensagem();

            // Verificação de tipo seguro para chamar os métodos específicos de cada classe filha
            if (animal instanceof Cachorro) {
                // Downcasting automático (Pattern Matching do Java 16+) ou tradicional:
                Cachorro dog = (Cachorro) animal;
                System.out.println("-> Este animal é um Cachorro.");
            } else if (animal instanceof Gato) {
                Gato cat = (Gato) animal;
                System.out.println("-> Este animal é um Gato.");
            }
            System.out.println("-----------------------------------");
        }
        sc.close();
    }
}
