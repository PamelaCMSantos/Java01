package conceitosJava.src.main.java.org.example.abstracao.interfaceAbstrata;
// A Classe filha agora vai herda da classe pai
// Veiculo E implementar o contrato Aereo (por ser um veículo aéreo)
// Utilizamos o implements seguido da interface que deseja implementar
public class Aviao extends Veiculo implements Aereo{
    //Agora, a classe Aviao tmabém é OBRIGADA a implementar todos os metodos da interface Aereo
    public Aviao(String nome) {
        super(nome);
    }
    @Override
    public void tipoVeiculo() {
        super.tipoVeiculo();
    }
    //Quando termina de digitar os metrodos, eles ficam azul.
    // E exibem a conexão com as classes ao passar o cursor por cima.
    // Cada classe que implementa pode sobreescrever as suas próprias características.

    @Override
    public void decolar(){
        System.out.println(getNome() + " Esta decolando!");
    }
    @Override
    public void pousar(){
        System.out.println(getNome() + " Esta pousando!");

    }
}
