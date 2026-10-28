package conceitosJava.src.main.java.org.example.abstracao.interfaceAbstrata;

public class Veiculo {
    private String nome;
    public Veiculo(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void tipoVeiculo() {
        System.out.println("O veículo é um/uma " + getNome());
    }
}
