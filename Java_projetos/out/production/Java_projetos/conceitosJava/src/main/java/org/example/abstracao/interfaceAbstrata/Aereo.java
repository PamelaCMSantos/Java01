package conceitosJava.src.main.java.org.example.abstracao.interfaceAbstrata;
// Contrato para qualquer classe que Veículo que seja Voe
// Trocamos a palavra class pela palavra interface
public interface Aereo {
    // Métodos em interfaces são implicitamente 'public' e 'abstract'
    void decolar();
    void pousar();
}
