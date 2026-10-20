package calculadora.src.main.java.calculadora;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double valor1;
        Double valor2;
        String operacao;
        boolean continuar;
        try {
            do {
                System.out.println("Digite o primeiro valor: ");
                valor1 = scanner.nextDouble();

                System.out.println("Qual a operação? (+, -, / ou *)");
                operacao = scanner.next();

                System.out.println("Digite o segundo valor: ");
                valor2 = scanner.nextDouble();
                if (valor1 == 0.0 || valor2 == 0.0) {
                    System.out.println("Erro!! não existe divisão por 0 ");
                }
                System.out.println("Resultado: " + calcular(valor1, valor2, operacao));

                continuar = verificaOperacao();
            } while (continuar);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao tentar calcular");

        }
}

    public static boolean verificaOperacao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja realizar uma nova operação? (S/N)");

        // Se for diferente de N, ele segue. Se for N, ele para a aplicação
        return !scanner.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double calcular(Double valor1, Double valor2, String operacao) {
        double resultado = 0.0;
        switch (operacao){
            case "+":
                resultado = valor1 + valor2;
                break;
            case "*":
                if (valor1 == 0.0 || valor2 == 0.0) {
                    resultado = 0.0;
                } else {
                resultado = valor1 * valor2;}
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            default:
                System.out.println("Operação inválida");
        }
        return resultado;
    }

}
